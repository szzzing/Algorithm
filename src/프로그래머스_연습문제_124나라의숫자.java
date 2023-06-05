
public class 프로그래머스_연습문제_124나라의숫자 {

	public static String solution(int n) {
	
		String answer = "";
	
		while(n>0) {
			answer = n%3 + answer;
			n /= 3;
		}
		answer.replaceAll("3", "4");
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		System.out.println(solution(12));
	}
}