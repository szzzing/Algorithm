import java.util.TreeSet;

public class ���α׷��ӽ�_2017īī���ڵ庻��_��ü������� {

	public static void main(String[] args) {
		System.out.println(makeSet());
	}


	public static int solution(int n, String[] data) {
		int answer = 0;
		
		TreeSet<String> set = makeSet();
		
		return answer;
	}
	
	public static TreeSet<String> makeSet() {
		
		TreeSet<String> set = new TreeSet<>();
		
		for (int a=0 ; a<8 ; a++) {
			for(int b=0 ; b<8 ; b++) {
				if(b!=a)
				for(int c=0 ; c<8 ; c++) {
					if(c!=b || c!=a)
					
										set.add(""+a+b+c);
									}
						
			}
		}
		System.out.println("�Ϸ�");
		
		return set;
	}

}
