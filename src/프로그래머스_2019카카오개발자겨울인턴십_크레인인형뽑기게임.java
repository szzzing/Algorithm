import java.util.Stack;

public class ���α׷��ӽ�_2019īī�������ڰܿ����Ͻ�_ũ���������̱���� {

	public static void main(String[] args) {
		int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves={1,5,3,5,1,2,1,4};
		int answer=solution(board, moves);
		System.out.println(answer);
	}

	public static int solution(int[][] board, int[] moves) {

		int answer=0;
		Stack<Integer> basket=new Stack<>();
		Stack<Integer>[] dolls=new Stack[board.length];

		// ���带 �������� �����
		for(int i=0 ; i<dolls.length ; i++) {
			dolls[i]=new Stack<>();
			for(int j=dolls.length-1 ; j>=0 ; j--) {
				if(board[j][i]!=0) {
					dolls[i].push(board[j][i]);
				}
			}
		}
		
		for(int move : moves) {
			if(!dolls[move-1].empty()) {
				int pickedDoll=dolls[move-1].pop();
				
				if(!basket.empty()) {
					if(basket.peek()==pickedDoll) {
						basket.pop();
						answer+=2;
						continue;
					}
				}
				
				basket.push(pickedDoll);
			}
		}
		
		return answer;
	}
}


