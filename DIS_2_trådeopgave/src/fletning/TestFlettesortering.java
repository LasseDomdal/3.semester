package fletning;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class TestFlettesortering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		Random r=new Random();
//		for (int i=0;i<1000000;i++) {
//			list.add(Math.abs(r.nextInt()%10000));
//		};
		
//		System.out.println(list);
		
		worker tråd1 = new worker();
		
		
		tråd1.start();
		
		
		try {
			tråd1.join();
			
		} catch (Exception e) {
			
		}
	
		
		FletteSortering sort = new FletteSortering();
		long l1,l2;
		l1 = System.nanoTime();
		sort.mergesort(list,0,list.size()-1);
		l2 = System.nanoTime();
		System.out.println();
		System.out.println("Køretiden var " + (l2-l1)/1000000);
		System.out.println();
//		System.out.println(list);
		// køretider: 563 559 542 564
	}

}
