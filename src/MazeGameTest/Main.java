package MazeGameTest;

import MazeGameTest.Graph.Graph;
import MazeGameTest.Graph.Graph2;
import MazeGameTest.MazeGames.MultiPlayerMazeGame;
import MazeGameTest.model.CellLocation;
import MazeGameTest.model.CellState;
import MazeGameTest.model.Maze;

import java.util.List;

public class Main {
    private final static MultiPlayerMazeGame multiPlayerMazeGame = new MultiPlayerMazeGame();
    private static CellLocation lastCheeseLoc = new CellLocation(-1, -1);

    private int timeInterval = 200;

    private static CellLocation[] playerLocArray;
    private static int pcPlayerLocArrInd = 0;

    private static Graph g;
    private static Graph2 g2;

    public static void main(String[] args) {

        addGraphEdges();

//        try {
            System.out.println("running");
            //todo add observer instead of using if condition
        if (!lastCheeseLoc.equals(multiPlayerMazeGame.getCheeseLocation())) {
            System.out.println("new cheese placed");
            lastCheeseLoc = multiPlayerMazeGame.getCheeseLocation();
            calculateArray();
        }
//        System.out.println(playerLocArray);
//            setPCPlayerLoc();
//            doWonOrLost();
//            Thread.sleep(timeInterval);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    private static void setPCPlayerLoc() {
        System.out.println("setPCPlayerLoc");
        if (pcPlayerLocArrInd < playerLocArray.length) {
            multiPlayerMazeGame.recordPCPlayerLoc(playerLocArray[pcPlayerLocArrInd++]);
            System.out.printf("pcPlayerLocArrInd : %d: out of %d \n", pcPlayerLocArrInd, playerLocArray.length);
        } else {
            System.out.println("in cheese location");
        }
    }

    private static void convertGraphIndicesToLocs(List<Integer> indices) {
        playerLocArray = new CellLocation[indices.size()];
        int width = MultiPlayerMazeGame.getBoardWidth();
        for (int i = 0; i < indices.size(); i++) {
            int x = indices.get(i) % width;
            int y = indices.get(i) / width;
            playerLocArray[i] = new CellLocation(x, y);
        }
    }

    private static int convertLocToGraphVertexIndex(CellLocation cellLocation) {
        return cellLocation.y * MultiPlayerMazeGame.getBoardWidth() + cellLocation.x;
    }

    private static int[][] getDirections() {
        return new int[][] {{0, 1}, {0, -1}, {-1, 0}, {1, 0} };
    }

    private static void calculateArray() {
        System.out.println("calculating array");
        pcPlayerLocArrInd = 0;
        int secondPLayerGraphVertexIndex = convertLocToGraphVertexIndex(multiPlayerMazeGame.getPCCellLocation());
        System.out.println("multiPlayerMazeGame " + multiPlayerMazeGame.getPCCellLocation().x + " " + multiPlayerMazeGame.getPCCellLocation().y);

//        System.out.printf("secondPLayerGraphVertexIndex %d \n", secondPLayerGraphVertexIndex);
        CellLocation cheeseLoc = multiPlayerMazeGame.getCheeseLocation();
        System.out.println("cheeseLoc " + cheeseLoc.x + " " + cheeseLoc.y);
        int cheeseGraphLoc = convertLocToGraphVertexIndex(cheeseLoc);
//        System.out.printf("cheeseGraphLoc %d \n", cheeseGraphLoc);

        System.out.println("secondPLayerGraphVertexIndex :"+ secondPLayerGraphVertexIndex
                + " cheeseGraphLoc: " + cheeseGraphLoc);
//        List<Integer> pathIndices = g.getFirstPath(secondPLayerGraphVertexIndex, cheeseGraphLoc);
//        System.out.println("fucking found it\nfuck!n");

//        convertGraphIndicesToLocs(pathIndices);
//        System.out.println("calculating array finished");


//        g2.printAllPaths(secondPLayerGraphVertexIndex, cheeseGraphLoc);
        List<Integer> res = g.getFirstPath(secondPLayerGraphVertexIndex, cheeseGraphLoc);

        for (int i : res) {
            System.out.println(i);
        }
        System.out.println("calculating array finished");

    }


    public static void doWonOrLost() {
//        System.out.println("called");
        if (multiPlayerMazeGame.hasAnyUserWon()) {
            revealBoard();
        } else if (multiPlayerMazeGame.hasAnyUserLost()) {
            revealBoard();
        } else {
            assert false;
        }
    }
    public static void revealBoard() {
        multiPlayerMazeGame.displayBoard();
    }

    private static void addGraphEdges() {
        g = new Graph(MultiPlayerMazeGame.getBoardHeight() * MultiPlayerMazeGame.getBoardWidth());
        g2 = new Graph2(MultiPlayerMazeGame.getBoardHeight() * MultiPlayerMazeGame.getBoardWidth());

        Maze maze = multiPlayerMazeGame.getMaze();
        CellState[][] board = maze.getBoard();
        int[][] directions = getDirections();

        for (int i = 1; i <= board.length - 2; i++) {
            for (int j = 1; j <= board[0].length - 2; j++) {
                if (!board[i][j].isWall()) {
                    for (int[] direction : directions) {
                        int tarX = i + direction[0];
                        int tarY = j + direction[1];
                        CellLocation cellLocation = new CellLocation(i, j);
                        CellLocation targetCellLocation = new CellLocation(tarX, tarY);
                        if (!board[tarX][tarY].isWall()) {
                            int graphVertexIndex = convertLocToGraphVertexIndex(cellLocation);
                            int graphTargetVertexIndex = convertLocToGraphVertexIndex(targetCellLocation);
//                            System.out.println(graphVertexIndex);
                            g.addEdge(graphVertexIndex, graphTargetVertexIndex);
                            g2.addEdge(graphVertexIndex, graphTargetVertexIndex);
                        }
                    }
                }
            }
        }
    }


}
