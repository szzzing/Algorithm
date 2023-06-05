import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프로그래머스_스택큐_기능개발 {

	public static void main(String[] args) {
		int[] progresses={93,30,55};
		int[] speeds={1,30,5};
		System.out.println(Arrays.toString(solution(progresses,speeds)));
		ArrayList arrayList=new ArrayList();
		arrayList.toArray();
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		
		int index=0;
		int needDay=0;
		int[] answer = new int[progresses.length];
		int answerIndex=0;
		Queue<Integer> q=new LinkedList<Integer>();
		
		for (int p:progresses) {
			q.offer(new Integer(100-p));
		}

		while(!q.isEmpty()) {
			
			// 큐에서 첫번째에 있는 기능을 개발하는데에 걸리는 날짜 계산
			needDay=(100-progresses[index])/speeds[index] + ((100-progresses[index])%speeds[index]==0 ? 0 : 1);
			
			//	n일의 작업 후 개발이 완료된 기능 꺼내기
			while(!q.isEmpty()) {
				if(q.peek()-speeds[index]*needDay<=0) {
					q.poll();
					index++;
					answer[answerIndex]++;
				}
				else break;
			}
			answerIndex++;
		}
		
		//	새로운 배열에 저장
		int[] answer2=new int[answerIndex];
		System.arraycopy(answer, 0, answer2, 0, answerIndex);
		return answer2;
	}

}