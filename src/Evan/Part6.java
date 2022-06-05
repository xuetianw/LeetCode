package Evan;



import java.io.BufferedReader;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.*;


public class Part6 {



	/**

	 * Your code goes here - see Part0 for an example

	 * @param r the reader to read from

	 * @param w the writer to write to

	 * @throws IOException

	 */

	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {

		List<String> s = new ArrayList<>();
//
//
//

		PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());


		for (String line = r.readLine(); line != null; line = r.readLine()) {

//				s.add(line);
			pq.add(line);
			//4001 smallest element
			if (pq.size() > 4001) {
				pq.poll();
			}

		}
		System.out.println(pq.peek());

//		[8,7,6,5,4,3,2,1]
//		PQ = 3 [3, 2, 1]

//
//
//
//		if(s.size() < 4001){
//
//			return;
//
//		}



/*for(int i = 0; i<s.size(); i++){

			for(int j = i+1; j<s.size();j++ ){

				if(s.get(i).compareTo(s.get(j))>0){

					String temp = s.get(i);

					s.set(i,s.get(j));

					s.set(j,temp);

				}

			}

		}*/

//		for(int i =0; i<4001; i++){
//
//			int minIndex = i;
//
//			String minValue = s.get(i);
//
//			for(int j=i+1; j<s.size();j++){
//
//				if(s.get(j).compareTo(minValue)<0){
//
//					minIndex = j;
//
//					minValue = s.get(j);
//
//					String temp = s.get(minIndex);
//
//					s.set(minIndex,s.get(i));
//
//					s.set(i,temp);
//
//				}
//
//			}
//
//		}



//				w.println(s.get(4000));





	}



	/**

	 * The driver.  Open a BufferedReader and a PrintWriter, either from System.in

	 * and System.out or from filenames specified on the command line, then call doIt.

	 * @param args

	 */

	public static void main(String[] args) {
		Random rnd = new Random(1234);
		for(int i = 0;i < 10; i++)
			System.out.println(rnd.nextInt(100));

		rnd = new Random(1234);
		for(int i = 0;i < 10; i++)
			System.out.println(rnd.nextInt(100));


//
//		try {
//
//			BufferedReader r;
//
//			PrintWriter w;
//
//			if (args.length == 1) {
//
//				r = new BufferedReader(new InputStreamReader(System.in));
//
//				w = new PrintWriter(System.out);
//
//			} else if (args.length == 0) {
//
//				r = new BufferedReader(new FileReader("/home/fred/chding_challenge/src/Evan/part6a.in"));
//
//				w = new PrintWriter(System.out);
//
//			} else {
//
//				r = new BufferedReader(new FileReader(args[0]));
//
//				w = new PrintWriter(new FileWriter(args[1]));
//
//			}
//
//			long start = System.nanoTime();
//
//			doIt(r, w);
//
//			w.flush();
//
//			long stop = System.nanoTime();
//
//			System.out.println("Execution time: " + 1e-9 * (stop-start));
//
//		} catch (IOException e) {
//
//			System.err.println(e);
//
//			System.exit(-1);
//
//		}

	}

}
