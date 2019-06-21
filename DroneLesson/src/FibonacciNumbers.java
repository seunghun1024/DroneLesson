
public class FibonacciNumbers {
	public static void main(String[] args) {
		int max_num = 4000000;
		int sum = 2;
		int fibo_first = 1;
		int fibo_second = 2;
		int fibo_third = 0;
		for(int i = 0; fibo_third < max_num; i++) {
			fibo_third = fibo_first + fibo_second;
			fibo_first = fibo_second;
			fibo_second = fibo_third;
			if(fibo_third%2 == 0) {
				sum += fibo_third;
			}
		}
		System.out.println(sum);
	}
}



/*피보나치 수열은 연속된 숫자의 합을 계속해서 붙여나갑니다.
1과 2부터 시작해서 10개까지 이어보면 다음과 같이 됩니다.
ex) 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
400만을 초과하지 않는 값 중에 짝수 수열의 합을 구하세요.*/