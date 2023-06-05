import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class 프로그래머스_2019카카오개발자겨울인턴십_불량사용자 {

	public static void main(String[] args) {
		
		solution(new String[]{"frodo","fradi"}, new String[]{"fr*d*","abc1**"});
		ArrayList list = new ArrayList<>();
		list.add("1");
		list.add("1");
		list.add("1");
		System.out.println(list.size());
	}
	
	
	public static int solution(String[] user_id, String[] banned_id) {
		int answer = 1;
		ArrayList<String>[] list = new ArrayList[banned_id.length];
		TreeSet<String> set = new TreeSet<>();
		
		for(int i=0 ; i<banned_id.length ; i++) {
			banned_id[i] = banned_id[i].replaceAll("\\*", "\\[a\\-z0\\-9\\]");
		}
		
		for(String id : user_id) {

			for(int i=0 ; i<banned_id.length ; i++) {
				list[i] = new ArrayList();
				if(Pattern.compile(banned_id[i]).matcher(id).matches()) {
					list[i].add(id);
				}
			}
		}
		
		for(ArrayList l : list) {
			TreeSet<String> s = new TreeSet<>();
			for(int i=0 ; i<l.size() ; i++) {
				
			}
		}
		
		return answer;
	}
}