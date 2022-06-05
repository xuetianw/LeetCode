package Evan;

import java.io.*;

public class PartImage {
    private boolean[][] pixels;
    private boolean[][] visited;
    private int rows;
    private int cols;
    public int border = 0;

    //Creates a new, blank Evan.PartImage with the given rows (r) and columns (c)
    public PartImage(int r, int c) {
        rows = r;
        cols = c;
        visited = new boolean[r][c];
        pixels = new boolean[r][c];
    }

    //Creates a new Evan.PartImage containing rw rows and cl columns
    //Initializes the 2D boolean pixel array based on the provided byte data
    //A 0 in the byte data is treated as false, a 1 is treated as true
    public PartImage(int rw, int cl, byte[][] data) {
        this(rw, cl);
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (data[r][c] == 1)
                    pixels[r][c] = true;
                else
                    pixels[r][c] = false;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public boolean getPixel(int r, int c) {
        return pixels[r][c];
    }

    public void print() {
        String string = "";
        for (boolean[] pixCol : pixels) {
            for (boolean pixRow : pixCol) {
                if (pixRow) {
                    string += "*";
                } else {
                    string += "-";
                }
            }
            string += "\n";
        }
        System.out.printf(string);
    }

    public Point2D findStart() {
        for (int r = 0; r < cols; r++) {
            for (int c = 0; c < rows; c++) {
                if (pixels[r][c] ) {
                    return new Point2D(r, c);
                }
            }
        }
        return null;
    }

    public int partSize() {
        int size = 0;
        for (boolean[] pixCol : pixels) {
            for (boolean pixRow : pixCol) {
                if (pixRow) {
                    size++;
                }
            }
        }
        return size;
    }

    private void expandFrom(int r, int c) {
        try {
            boolean bool = pixels[r][c];
            if (bool) {
                visited[r][c] = true;
                pixels[r][c] = false;
                expandFrom(r + 1, c);
                expandFrom(r - 1, c);
                expandFrom(r, c + 1);
                expandFrom(r, c - 1);
            } else if (!visited[r][c]) {
                border += 1;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.border++;
        }
    }

    private int perimeterOf(int r, int c) {
        try {
            boolean bool = pixels[r][c];
            if (bool) {
                visited[r][c] = true;
                pixels[r][c] = false;
                perimeterOf(r + 1, c);
                perimeterOf(r - 1, c);
                perimeterOf(r, c + 1);
                perimeterOf(r, c - 1);
            } else if (!visited[r][c]) {
                border += 1;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.border++;
        }
        return border;
    }

    public boolean isBroken() {
        Point2D p = findStart();
        expandFrom((int) p.getX(), (int) p.getY());
        return (partSize() != 0);
    }

    public int perimeter() {
        Point2D p = findStart();
        return perimeterOf((int) p.getX(), (int) p.getY());
    }

    public int countPieces() {
        Point2D startingPoint = findStart();

        return -1;
    }

    public static PartImage readFromFile(String fileName) throws InvalidPartImageException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));

            // get how large data's array should be
            String line = "";
            int numRows = 0;
            int numCols = 0;
            int lastNumCols = 0;
            while(true){
                line = in.readLine();
                if (line == null) {
                    break;
                }
                numRows += 1;

                lastNumCols = numCols;
                numCols = countIntegers(line);

                // unequal number of column
                if (lastNumCols != numCols && lastNumCols != 0) {
                    throw new InvalidPartImageException(fileName);
                }
            }
            in.close();

            // 2D byte array of 0s and 1s from the file
            byte[][] data = new byte[numRows][numCols];
            // go through file and build data variable
            in = new BufferedReader(new FileReader(fileName));

            for(int i = 0; i < numRows; i++){
                int j = 0;
                while(true){
                    int b = in.read();
                    // check that it's a valid  (must be 0 or 1)
                    if(b == -1 || b == 10){
                        break;
                    }else if(b == 48){
                        data[i][j] = 0;
                        j++;
                    }else if(b == 49){
                        data[i][j] = 1;
                        j++;
                    }else if(b == 44 || b == 13){
                        continue;
                    }else {
                        throw new InvalidPartImageException(fileName);
                    }
                }
            }

            PartImage newPartImage = new PartImage(numRows,numCols,data);
            return newPartImage;

        } catch (FileNotFoundException e){
            return null;
        } catch (IOException e) {
            return null;
        }

    }

    public static int countIntegers(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' || s.charAt(i) == '0') {
                count += 1;
            }
        }
        return count;
    }
}
