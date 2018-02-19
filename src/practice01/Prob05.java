package practice01;

public class Prob05 {

	void solve() {
		StringBuffer sb = new StringBuffer();
		int clapNum = 0, tempNum;
		boolean isRight = false;
		
		for (int number = 1; number < 100; number++) {
			sb.append(number);
			
			for(int i=0;i<sb.length();i++) {
				tempNum = sb.charAt(i) - '0';
				if(tempNum != 0 && tempNum % 3 == 0) {
					isRight = true;
					clapNum++;
				}
			}
			
			if(isRight) {
				sb.append(" ");
				for(int i=0;i<clapNum;i++) {
					sb.append("짝");
				}
				System.out.println(sb);
			}
			
			sb.setLength(0);
			clapNum = 0;
			isRight = false;
		}
	}

	public static void main(String[] args) {
		Prob05 p = new Prob05();
		p.solve();

	}

}
