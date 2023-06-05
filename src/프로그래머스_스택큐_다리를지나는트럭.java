import java.util.LinkedList;

public class ���α׷��ӽ�_����ť_�ٸ���������Ʈ�� {

	public static void main(String[] args) {
		int[] tw = {7,4,5,6};
		int bl = 2;
		int w = 10;
		System.out.println(solution(bl, w, tw));
	}
	
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer=0;
		int current =0;	//	���� �ٸ� ���� �ִ� Ʈ������ ���� ����

		LinkedList<Truck> trucks = new LinkedList<>();	//	������� Ʈ����
		LinkedList<Truck> bridge = new LinkedList<>();	//	�ٸ����� �ִ� Ʈ����

		for (int t : truck_weights) {
			trucks.offer(new Truck(t,bridge_length));
		}

		while(!trucks.isEmpty() || !bridge.isEmpty()) {
			answer++;
			System.out.println("time: "+answer);
				//	�ٸ� ���� Ʈ���� ���� ��� ������ �̵�
				if(!bridge.isEmpty()) {
					
					for(Truck t : bridge) {
						t.move--;
						System.out.println("t: "+t);
					}
					if(bridge.getFirst().move == 0) {
						System.out.println(bridge.peek()+" arrived");
						current -= bridge.poll().weight;
						System.out.println("current: "+current);
					}
					
				}
				
				//	�ٸ��� �� Ʈ���� �ø� �� �ִ� ��� ����ϱ�
				if(!trucks.isEmpty() && trucks.peek().weight + current <= weight && bridge.size() <= bridge_length) {
					bridge.offer(trucks.poll());
					current += bridge.peekLast().weight;
					System.out.println(bridge.peekLast()+" moved");
				}
				System.out.println("now: "+bridge);
				System.out.println();

		}
		return answer;

	}
	
}


class Truck {
	int weight;	//	Ʈ�� ����
	int move;	//	�ٸ��� �ǳʱ� ���� �������� �ϴ� Ƚ��(�ٸ� ����)

	Truck(int weight, int move) {
		this.weight=weight;
		this.move=move;
	}
	
	@Override
	public String toString() {
		return "["+weight+","+move+"]";
	}

}