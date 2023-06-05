import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ���α׷��ӽ�_����ť_��ɰ��� {

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
			
			// ť���� ù��°�� �ִ� ����� �����ϴµ��� �ɸ��� ��¥ ���
			needDay=(100-progresses[index])/speeds[index] + ((100-progresses[index])%speeds[index]==0 ? 0 : 1);
			
			//	n���� �۾� �� ������ �Ϸ�� ��� ������
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
		
		//	���ο� �迭�� ����
		int[] answer2=new int[answerIndex];
		System.arraycopy(answer, 0, answer2, 0, answerIndex);
		return answer2;
	}

}