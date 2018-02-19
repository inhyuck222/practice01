package practice01;

public class Prob02 {
	
	void solve() {
		for(int startIndex = 1; startIndex < 10; startIndex++) {
			for(int addedNumber = 0; addedNumber < 10; addedNumber++) {
				System.out.print(startIndex + addedNumber + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Prob02 m = new Prob02();
		m.solve();
	}

}
