
public class FractionalDecomposition {
	public static void main(String[] args) {
		long num = 600851475143l;
		int maxnum = 0;
		for(int i = 2; i <= num; i++) {
			if(num%i == 0) {
				num = num/i;
				if(maxnum < i) {
					maxnum = i;
				}
			}
		}
		System.out.println(maxnum);
}
}


/*13195의 소인수는 5, 7, 13, 29 입니다.
600851475143 의 최대 소인수는 무엇입니까?*/