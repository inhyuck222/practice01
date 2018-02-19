package practice01;

import java.util.Scanner;

public class Prob03 {
	

	void solve() {
		Scanner sc = new Scanner(System.in);
		int number, result = 0, subValue = 2;
				
		for (int repeat = 0; repeat < 3; repeat++) {
			System.out.print("숫자를 입력하세요 : ");
			number = sc.nextInt();
			
			while(number > 0) {
				result += number;
				number -= subValue;
			}
			
			System.out.println("결과 값 : " + result);
			result = 0;
		}
	}

	public static void main(String[] args) {
		Prob03 p = new Prob03();
		p.solve();
	}

}
