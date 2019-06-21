
public class MinimumMultiplication {
	public static void main(String[] args) {
		int startnum = 1;
		int limitnum = Integer.MAX_VALUE;
		int division = 20;
		int check = 0;
		for(int i = 1; i < limitnum; i++) {
			for(int j = startnum; j <= division; j++) {
				if(i%j == 0) {
					check++;
				}
			}
			if(check == division) {
				System.out.println(startnum + "부터 " + division + "까지의 숫자로 모두 나눠지는 최소의 수는 " + i + "입니다.");
				break;
			}
			check = 0;
		}
	}
}


/*2520은 1부터 10까지의 숫자로 모두 나눠지는 최소의 수입니다.
1부터 20까지의 숫자로 모두 나눠지는 최소의 수를 구하세요.*/