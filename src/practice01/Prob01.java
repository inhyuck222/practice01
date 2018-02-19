package practice01;

import java.util.Scanner;

public class Prob01 {

	void solve(int number) {
		if (number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하시오 : ");
		
		int number = scanner.nextInt();
		
		Prob01 p = new Prob01();
		p.solve(number);
	}
}
