
public class ���α׷��ӽ�_��������_124�����Ǽ��� {

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