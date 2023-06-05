public class 프로그래머스_2021카카오블라인드신규채용_신규아이디추천 {

	public static void main(String[] args) {
		
		
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}

	public static String solution2(String new_id) {

		//	1. 소문자 치환, 2. 사용불가문자 제거, 3. .이 연속된 경우 제거 4. 문자열 가장자리가 .인 경우 제거
		String answer =
				new_id.toLowerCase().replaceAll("[^a-z0-9._-]","")
				.replaceAll("[.]{2,}",".")
				.replaceAll("^[.]|[.]$","");

		//	5. 아이디가 비어있는 경우 aaa 리턴
		if(answer.length()==0) return "aaa";

		//	7. 길이가 3보다 작은 경우 마지막 문자 추가
		while(answer.length()<3) {
			answer += answer.charAt(answer.length()-1);
		}

		//	6. 길이가 15 이상인 경우 제거하고, 이 때 마지막 문자가 .인 경우 제거
		if(answer.length()>15) {
			answer = answer.substring(0,15).replaceAll("[.]$","");
		}

		return answer;
	}



	public static String solution(String new_id) {
		StringBuffer sb = new StringBuffer();

		//	1. 소문자 치환
		char[] id = new_id.toLowerCase().toCharArray();

		//	2. 사용불가문자 제거
		for(char c : id) {
			if((c>='a' && c<='z') || (c>='0' && c<='9') || c=='-' || c=='_') {
				sb.append(c);
			}

			//	4. .이 아이디의 처음에 있거나 3. 연속으로 있는 경우 버퍼에 넣지 않음
			if(c=='.' && sb.length()!=0 && sb.charAt(sb.length()-1)!='.') {
				sb.append(c);
			}
		}

		//	5. 아이디가 비어있는 경우 aaa를 리턴
		if(sb.length()==0) return "aaa";

		//	4. 아이디 마지막 문자가 .인 경우 제거
		if(sb.charAt(sb.length()-1)=='.') {
			sb.deleteCharAt(sb.length()-1);
		}

		//	6. 길이가 15 이상인 경우 제거하고, 이 때 마지막 문자가 .인 경우 제거
		if(sb.length()>15) {
			sb.delete(15, sb.length());
			if(sb.charAt(sb.length()-1)=='.') {
				sb.deleteCharAt(sb.length()-1);
			}
		}

		//	7. 길이가 3보다 작은 경우 마지막 문자를 추가해줌
		while(sb.length()<3) {
			if(sb.length()>0) {
				char c = sb.charAt(sb.length()-1);
				sb.append(c);
			}
		}

		return sb.toString();
	}
}