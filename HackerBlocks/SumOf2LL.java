package HackerBlocks;
import java.util.LinkedList;
import java.util.Scanner;

public class SumOf2LL {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		LinkedList<Integer> ln = new LinkedList<>();
		LinkedList<Integer> lm = new LinkedList<>();
		LinkedList<Integer> ans = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			ln.add(in.nextInt());
		}
		for (int i = 0; i < m; i++) {
			lm.add(in.nextInt());
		}
		int sum = 0;
		while (!lm.isEmpty() || !ln.isEmpty()) {

// 			sum = 0;
			if (!lm.isEmpty()) {
				sum += lm.removeLast();
			}

			if (!ln.isEmpty()) {
				sum += ln.removeLast();
			}

//			sum += lm.removeLast() + ln.removeLast();
			if (sum / 10 == 0) {
				ans.addFirst(sum);
				sum = sum / 10;
			} else {
				int add = sum % 10;
				sum = sum / 10;
				ans.addFirst(add);
			}

		}
		if (!lm.isEmpty()) {
			ans.addFirst(lm.removeLast() + sum);
			sum = sum / 10;
		}
		if (!ln.isEmpty()) {
			ans.addFirst(ln.removeLast() + sum);
			sum = sum / 10;
		}
		if (sum != 0) {
			ans.addFirst(sum);
		}
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}
}
