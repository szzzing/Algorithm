import java.util.ArrayList;
import java.util.HashMap;

public class ���α׷��ӽ�_2019īī������ε�ű�ä��_����ä�ù� {

	public static void main(String[] args) {

		String[] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}; 
		solution(str);
	}


	public static String[] solution(String[] record) {

		ArrayList<String> messages = new ArrayList<>();	//	���� ��µ� �޼��� ���
		HashMap<String, String> users = new HashMap<>();	//	ä�� ������ ���

		//	���� �����ϰų� �г����� ������ ��� ä�� ������ ��� ����
		for(String r : record) {

			String[] str = r.split(" ");

			if(str[0].equals("Enter") || str[0].equals("Change")) {
				users.put(str[1], str[2]);
			}
		}

		//	ä�� ���ε�
		for(String r : record) {

			String[] str = r.split(" ");

			switch(str[0]) {
				case "Enter" :
					messages.add(users.get(str[1])+"���� ���Խ��ϴ�.");
					break;

				case "Leave" : 
					messages.add(users.get(str[1])+"���� �������ϴ�.");
					break;
			}
		}

		return messages.toArray(new String[messages.size()]);
	}
}