import java.util.*;

public class ���α׷��ӽ�_����ť_������ {
	public static void main(String[] args) {
		int answer=solution(new int[]{1,1,9,1,1,1},0);
		System.out.println(answer);
	}

	public static int solution2(int[] priorities, int location) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();

		for(int i=0 ; i<priorities.length ; i++) {
			q.add(i);
		}

		while(!q.isEmpty()) {
			int tmp = q.peek();
			boolean print = true;

			for(int i : q) {
				if(priorities[tmp] < priorities[i]) {
					print = false;
					q.offer(q.poll());
					break;
				}
			}

			if(print) {
				answer++;
				if(q.peek() == location) break;
				q.poll();
			}
		}

		return answer;
	}


	public static int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Document> queue=new LinkedList<>();

		// ť�� �������� ���ʷ� ����
		for (int i=0;i<priorities.length;i++) {
			queue.add(new Document(i,priorities[i]));
		}

		// �������� ������ ����
		while(!queue.isEmpty()) {
			int num=queue.peek().priority;
			boolean print=true;

			// Ÿ�� ������ �߿䵵�� �Ǻ�
			for (Document d:queue) {
				if (num<d.priority) {
					print=false;
					queue.offer(queue.poll());
					break;
				}
			}

			// ���� �߿��� ������ �Ǹ� ���, ť���� �̾Ƴ�
			if (print) {
				answer++;
				if (queue.peek().location==location) {
					break;
				}
				else queue.poll();
			}
		}

		return answer;
	}
}

class Document {
	int location;
	int priority;

	Document(int location, int priority) {
		this.location=location;
		this.priority=priority;
	}
}