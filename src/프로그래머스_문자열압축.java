public class 프로그래머스_문자열압축 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		System.out.println(solution("xxxxxxxxxxyyy"));
		//		System.out.println(solution("a"));
		//		System.out.println(solution("aabbaccc"));
		System.out.println(solution("ababcdcdababcdcd"));
		System.out.println("ababcdcdababcdcd".length());
	}

	public static int solution(String s) {

		int answer = s.length();

		for(int i=1 ; i<=s.length()/2 ; i++) {
			int result = 0;
			int count = 0;
			String start = s.substring(0,i);

			for(int j=0 ; j<s.length() ; j+=i) {
				String now = s.substring(j , j+i<s.length() ? j+i : s.length());

				if(now.equals(start)) {
					count++;
				}
				else {	
					result += (count==1 ? 0 : (int)Math.log10(count)+1) + start.length();
					start = now;
					count = 1;
				}
			}
			
			result += (count==1 ? 0 : (int)Math.log10(count)+1) + start.length();
			answer = answer>result ? result : answer;
		}

		return answer;
	}
}
