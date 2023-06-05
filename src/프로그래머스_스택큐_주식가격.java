import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 프로그래머스_스택큐_주식가격 {

	public static void main(String[] args) {
		int[] answer = solution(new int[]{1,2,3,2,3});
		System.out.println(Arrays.toString(answer));
		
		ArrayList<Integer> arrayList=new ArrayList<>();
	}


	public static int[] solution(int[] prices) {
		int[] answer=new int[prices.length];
		Stack<Integer> s=new Stack();

		for(int i=0 ; i<prices.length ; i++) {
			while(!s.empty() && prices[i]<prices[s.peek()]) {
				int index=s.pop();
				answer[index]=i-index;
			}
			s.push(i);
		}
		
		for(int i : s) {
			answer[i]=prices.length-1-i;
		}

		return answer;
	}



	public static int[] solution2(int[] prices) {
		int[] answer=new int[prices.length];

		for(int i=0 ; i<prices.length-1 ; i++) {
			for(int j=i+1 ; j<prices.length ; j++) {
				answer[i]++;
				if(prices[i]>prices[j]) {
					break;
				}
			}
		}

		return answer;
	}
}
