package practice01;

import java.util.Scanner;

public class Prob04 {
	
	void solve(String text) {
		char[] values = text.toCharArray();
		StringBuffer result = new StringBuffer();
		
		for(int i=0;i<values.length;i++) {
			result.append(values[i]);
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		Prob04 p = new Prob04();
		p.solve(text);

	}
}