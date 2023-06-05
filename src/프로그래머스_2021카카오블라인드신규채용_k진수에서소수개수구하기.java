
public class 프로그래머스_2021카카오블라인드신규채용_k진수에서소수개수구하기 {

	public static void main(String[] args) {
		
		System.out.println(change(1, 2));
		System.out.println(Integer.toBinaryString(1));
	}
 	
	
	static String change (int num, int k) {
		String answer = "";
		
		int i = 0;
		int n = num;
		
		while(n>=k) {
			n /= k;
			i++;
		}
		System.out.println(i);
		
		for (int j=i ; j>0 ; j--) {
			
			answer += num / (int)Math.pow(k, j);
			num %= Math.pow(k, j);
			System.out.println("answer"+answer);
			System.out.println(num);
		}
		
		
		return answer;
	}
}
