
public class Decimal {
	public static void main(String[] args) {
		int num = Integer.MAX_VALUE;
		int check = 0;
		int decimalcheck = 0;
		int decimalcount = 10001;
		for(int i = 2; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					check++;
				}
			}
			if(check == 2) {
				decimalcheck++;
			}
			check = 0;
			if(decimalcheck == decimalcount) {
				System.out.println(i);
				break;
			}
		}
	}
}


/*소수를 순서대로 열거하면,
2, 3, 5, 7, 11, 13 ... 이고
6번째 소수는 13입니다.
10001번째 소수는 무엇인가요?*/