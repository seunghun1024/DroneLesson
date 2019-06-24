
public class Sunday {
	static int day = 0;
	static int sunday = 0;
	static int year = 0;
	static int month = 0;
	public static void main(String[] args) {
		int startyear = 1901;
		int endyear = 2001;
		int startmonth = 1;
		int endmonth = 12;
		for (year = startyear; year < endyear; year++) {
			for (month = startmonth; month <= endmonth; month++) {
				if (month == 4 || month == 6 || month == 9 || month == 11) {
					sundaycheck(30);
				} else if (month == 2) {
					if (year%4 == 0) {
						sundaycheck(29);
					}else if(!(year%400 == 0)&&(year%100 == 0)) {
						sundaycheck(28);
					}
					else {
						sundaycheck(28);
					}
				} else {
					sundaycheck(31);
				}
			}
		}
		System.out.println("매월 1일이 일요일인 경우는 " + sunday + "번 입니다.");
	}
	
	public static void sundaycheck(int daycheck) {
		for(int j = 0; j < daycheck; j++) {
			if(day%7 == 0 && j == 0) {
				System.out.println(year + "년 " + month + "월 1일은 일요일입니다.");
				sunday++;
			}
			day++;
		}
	}
}

/*
 * 다음은 달력에 관한 몇 가지 일반적인 정보입니다 (필요한 경우 좀 더 연구를 해 보셔도 좋습니다). 1900년 1월 1일은 월요일이다.
 * 4월, 6월, 9월, 11월은 30일까지 있고, 1월, 3월, 5월, 7월, 8월, 10월, 12월은 31일까지 있다. 2월은
 * 28일이지만, 윤년에는 29일까지 있다. 윤년은 연도를 4로 나누어 떨어지는 해를 말한다. 하지만 400으로 나누어 떨어지지 않는 매
 * 100년째는 윤년이 아니며, 400으로 나누어 떨어지면 윤년이다 20세기 (1901년 1월 1일 ~ 2000년 12월 31일) 에서, 매월
 * 1일이 일요일인 경우는 총 몇 번입니까?
 */