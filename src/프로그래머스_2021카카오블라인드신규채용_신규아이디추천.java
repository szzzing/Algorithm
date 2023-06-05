public class ���α׷��ӽ�_2021īī������ε�ű�ä��_�űԾ��̵���õ {

	public static void main(String[] args) {
		
		
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}

	public static String solution2(String new_id) {

		//	1. �ҹ��� ġȯ, 2. ���Ұ����� ����, 3. .�� ���ӵ� ��� ���� 4. ���ڿ� �����ڸ��� .�� ��� ����
		String answer =
				new_id.toLowerCase().replaceAll("[^a-z0-9._-]","")
				.replaceAll("[.]{2,}",".")
				.replaceAll("^[.]|[.]$","");

		//	5. ���̵� ����ִ� ��� aaa ����
		if(answer.length()==0) return "aaa";

		//	7. ���̰� 3���� ���� ��� ������ ���� �߰�
		while(answer.length()<3) {
			answer += answer.charAt(answer.length()-1);
		}

		//	6. ���̰� 15 �̻��� ��� �����ϰ�, �� �� ������ ���ڰ� .�� ��� ����
		if(answer.length()>15) {
			answer = answer.substring(0,15).replaceAll("[.]$","");
		}

		return answer;
	}



	public static String solution(String new_id) {
		StringBuffer sb = new StringBuffer();

		//	1. �ҹ��� ġȯ
		char[] id = new_id.toLowerCase().toCharArray();

		//	2. ���Ұ����� ����
		for(char c : id) {
			if((c>='a' && c<='z') || (c>='0' && c<='9') || c=='-' || c=='_') {
				sb.append(c);
			}

			//	4. .�� ���̵��� ó���� �ְų� 3. �������� �ִ� ��� ���ۿ� ���� ����
			if(c=='.' && sb.length()!=0 && sb.charAt(sb.length()-1)!='.') {
				sb.append(c);
			}
		}

		//	5. ���̵� ����ִ� ��� aaa�� ����
		if(sb.length()==0) return "aaa";

		//	4. ���̵� ������ ���ڰ� .�� ��� ����
		if(sb.charAt(sb.length()-1)=='.') {
			sb.deleteCharAt(sb.length()-1);
		}

		//	6. ���̰� 15 �̻��� ��� �����ϰ�, �� �� ������ ���ڰ� .�� ��� ����
		if(sb.length()>15) {
			sb.delete(15, sb.length());
			if(sb.charAt(sb.length()-1)=='.') {
				sb.deleteCharAt(sb.length()-1);
			}
		}

		//	7. ���̰� 3���� ���� ��� ������ ���ڸ� �߰�����
		while(sb.length()<3) {
			if(sb.length()>0) {
				char c = sb.charAt(sb.length()-1);
				sb.append(c);
			}
		}

		return sb.toString();
	}
}