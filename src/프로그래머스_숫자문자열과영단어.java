import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class 프로그래머스_숫자문자열과영단어 {

	public static void main(String[] args) {
		System.out.println("answer: "+solution("one4seveneight"));
	}


	public static int solution(String s) {

		String[] eng = new String[] {
				"zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine"
		};
		
		for(int i=0 ; i<eng.length ; i++) {
			s = s.replaceAll(eng[i],i+"");
			System.out.println(s);
		}

		return Integer.parseInt(s);
	}
}
