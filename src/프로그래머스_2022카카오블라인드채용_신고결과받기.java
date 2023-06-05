import java.util.HashMap;
import java.util.HashSet;

public class 프로그래머스_2022카카오블라인드채용_신고결과받기 {
	
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		HashMap<String, HashSet<String>> reportList = new HashMap<>();
		HashMap<String, Integer> mailList = new HashMap<>();
		
		for (String id : id_list) {
			reportList.put(id, new HashSet<String>());
			mailList.put(id, 0);
		}
		
		for (String r : report) {
			String[] str = r.split(" ");
			((HashSet<String>)reportList.get(str[1])).add(str[0]);
		}
		
		for (String id : id_list) {
			
			if (reportList.get(id).size()>=k) {
				for (String s : reportList.get(id)) {
					int i = mailList.get(s)+1;
					mailList.put(s,i);
				}
				
			}
		}
		
		for (int i=0 ; i<id_list.length ; i++) {
			answer[i] = mailList.get(id_list[i]);
		}
		
		return answer;
	}
	
	public int[] solution2(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		
		
		return answer;
	}
}