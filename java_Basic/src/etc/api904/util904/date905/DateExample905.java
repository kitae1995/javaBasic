package etc.api904.util904.date905;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample905 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("==============================================");
		
		//현재 날짜 정보 얻기 (연,월,일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//현재 시간 정보 얻기 (시,분,초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		//현재 날짜와 시간 정보 얻기 (연,월,일,시,분,초)
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		
		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2022,7,1,9,0,0);//
		System.out.println(beginDate);
		
		//연,월,일 따로 추출
		int year = localdatetime.getYear();
		System.out.println(year);
		
		//정수 형태의 월 추출
		int monthValue = localdatetime.getMonthValue();
		System.out.println(monthValue);
		
		//문자 형태의 월 추출 (Month라는 열거형 타입 중 하나)
		Month month = localdatetime.getMonth();
		System.out.println(month);
		
		DayOfWeek dayofWeek = localdatetime.getDayOfWeek();
		System.out.println(dayofWeek);
		
		System.out.println("------------------------------------------------");
		
		//오늘날짜로부터 3일뒤의 날짜를 얻으려면 ? 
		LocalDateTime returndate = localdatetime.plusDays(3);
		System.out.println(returndate);
		
		//지금으로부터 1년 2개월 7일 뒤
		LocalDateTime D1 = localdatetime.plusYears(1).plusMonths(2).plusDays(7);
		System.out.println(D1);
		
		//지금으로부터 5년 5개월 12일전
		LocalDateTime D2 = localdatetime.minusYears(5).minusMonths(5).minusDays(12);
		System.out.println(D2);
		
		//사이 날짜 연산
		LocalDate b = LocalDate.of(2020,12,30);
		LocalDate f = LocalDate.of(2022,9,14);
		
		int between =  (int) ChronoUnit.WEEKS.between(b,f); //ChronoUnit 날짜 사이의 시간 구해주는 메서드
		System.out.println(between);
		
		System.out.println("=================================================");
		
		//날짜 포맷 변경하기
		System.out.println(localdatetime);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초");
		
		System.out.println(localdatetime.format(dtf));
	}

}
