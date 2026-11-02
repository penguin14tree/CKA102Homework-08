package hw1;

public class examine3 {
	public static void main(String[] args) {
		int seconds = 256559;
		int daysConvert = seconds / 86400; //一天標準定義有 86,400 秒
		int hoursConvert = (seconds % 86400) / 3600;
		int minutesConvert = ((seconds % 86400) % 3600) / 60;
		int secondsConvert = (((seconds % 86400) % 3600) % 60) % 60;
		String template = "%d seconds has %d days, %d hours, %d minutes and %d seconds.";
		String answer = template.formatted(seconds, daysConvert, hoursConvert, minutesConvert, secondsConvert);
		System.out.println(answer);
	}

}
