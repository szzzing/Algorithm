import java.util.ArrayList;
import java.util.HashMap;

public class 프로그래머스_2019카카오블라인드신규채용_오픈채팅방 {

	public static void main(String[] args) {

		String[] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}; 
		solution(str);
	}


	public static String[] solution(String[] record) {

		ArrayList<String> messages = new ArrayList<>();	//	최종 출력된 메세지 기록
		HashMap<String, String> users = new HashMap<>();	//	채팅 참여자 목록

		//	새로 입장하거나 닉네임을 변경할 경우 채팅 참여자 목록 갱신
		for(String r : record) {

			String[] str = r.split(" ");

			if(str[0].equals("Enter") || str[0].equals("Change")) {
				users.put(str[1], str[2]);
			}
		}

		//	채팅 업로드
		for(String r : record) {

			String[] str = r.split(" ");

			switch(str[0]) {
				case "Enter" :
					messages.add(users.get(str[1])+"님이 들어왔습니다.");
					break;

				case "Leave" : 
					messages.add(users.get(str[1])+"님이 나갔습니다.");
					break;
			}
		}

		return messages.toArray(new String[messages.size()]);
	}
}