import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class 프로그래머스_요격시스템 {
	
	public static void main(String[] args) {
		프로그래머스_요격시스템 p = new 프로그래머스_요격시스템();
		int[][] targets = {
			{0,4}, {8,9}, {5,10}, {6,8}
		};
		System.out.println(p.solution(targets));
		
		Com c = new Com();
		System.out.println(Arrays.toString(targets));
		Arrays.sort(targets, c);
		for(int[] t : targets) {
			System.out.println(Arrays.toString(t));
		}
		
	}
	
	public int solution(int[][] targets) {
		ArrayList<int[]> list = new ArrayList();
		list.add(new int[]{targets[0][0], targets[0][1]});
		
		for(int[] t : targets) {
			System.out.println("발사 : "+Arrays.toString(t));
			boolean matches = false;
			
			for(int j=0; j<list.size(); j++) {
				int[] se = list.get(j);
				
				if(!(t[0]>=se[1] || t[1]<=se[0])) {
					matches = true;
					
					if(t[0]>se[0]) {
						se[0] = t[0];
					}
					if(t[1]<se[1]) {
						se[1] = t[1];
					}
					list.set(j, se);
					break;
				}
			}
			if(!matches) list.add(new int[]{t[0], t[1]});
		}
		return list.size();
	}
}

class Com implements Comparator<int[]> {

	@Override
	public int compare(int[] o1, int[] o2) {
		return o1[1]-o2[1];
	}
}