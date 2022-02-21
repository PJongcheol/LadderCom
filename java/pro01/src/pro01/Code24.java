package pro01;

public class Code24 {
	public static void main(String[] args) {
		int n = 20000;
		int day = n / (24 * 60 * 60);
		int hour = (n / (60 * 60)) % 24;
		int min = (n / 60) % 60;
		int sec = n % 60;
		
		System.out.println(day + "일 " + hour + "시간 " + min + "분 " + sec + "초");
	}
	
	
	
}
