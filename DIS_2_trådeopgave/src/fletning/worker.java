package fletning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class worker extends Thread {

	private FletteSortering fletteSortering;

	public void run() {
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(Math.abs(r.nextInt() % 10000));
		}
		fletteSortering.mer

	}

}
