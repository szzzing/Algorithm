import java.util.*;

public class 프로그래머스_스택큐_프린터 {
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

		// 큐에 문서들을 차례로 저장
		for (int i=0;i<priorities.length;i++) {
			queue.add(new Document(i,priorities[i]));
		}

		// 문서들의 순서를 변경
		while(!queue.isEmpty()) {
			int num=queue.peek().priority;
			boolean print=true;

			// 타겟 문서의 중요도를 판별
			for (Document d:queue) {
				if (num<d.priority) {
					print=false;
					queue.offer(queue.poll());
					break;
				}
			}

			// 가장 중요한 문서로 판명난 경우, 큐에서 뽑아냄
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