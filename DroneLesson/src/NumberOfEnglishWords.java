
public class NumberOfEnglishWords {
	public static void main(String[] args) {
		int start_num = 1;
		int end_num = 1000;
		int word_length = 0;
		int word = 0;
		for (int i = 1; i <= end_num; i++) {
			word = i;
			if (word == 1000) {
				word_length += 11;
				word = word % 1000;
			}
			if (word / 100 == 9 || word / 100 == 5 || word / 100 == 4) {
				word_length += 14;
				word = word % 100;
			} else if (word / 100 == 8 || word / 100 == 7 || word / 100 == 3) {
				word_length += 15;
				word = word % 100;
			} else if (word / 100 == 6 || word / 100 == 2 || word / 100 == 1) {
				word_length += 13;
				word = word % 100;
			}

			if (word / 10 == 9 || word / 10 == 8 || word / 10 == 3 || word / 10 == 2) {
				word_length += 6;
				word = word % 10;
			} else if (word / 10 == 7) {
				word_length += 7;
				word = word % 10;
			} else if (word / 10 == 6 || word / 10 == 5 || word / 10 == 4) {
				word_length += 5;
				word = word % 10;
			} else if (word / 10 == 1) {
				word = word % 10;
				if (word == 0 || word == 1 || word == 2 || word == 3 || word == 5 || word == 8) {
					word_length += 3;
				} else {
					word_length += 4;
				}
			}
			if (word == 1 || word == 2 || word == 6) {
				word_length += 3;
			} else if (word == 4 || word == 5 || word == 9) {
				word_length += 4;
			} else {
				word_length += 5;
			}
		}
		System.out.println(start_num + "부터 " + end_num + "까지 단어 글자수의 합은 " + word_length + "개");
	}
}

/*
 * 1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고, 각 단어의 길이를 더하면 3 + 3 + 5 +
 * 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다. 1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?
 * 
 * 참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다. 예를 들어 342를 영어로 쓰면 three
 * hundred and forty-two 가 되어서 23 글자, 115 = one hundred and fifteen 의 경우에는 20
 * 글자가 됩니다.
 */