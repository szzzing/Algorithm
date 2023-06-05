import java.util.LinkedList;

public class 프로그래머스_스택큐_다리를지나는트럭 {

	public static void main(String[] args) {
		int[] tw = {7,4,5,6};
		int bl = 2;
		int w = 10;
		System.out.println(solution(bl, w, tw));
	}
	
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer=0;
		int current =0;	//	현재 다리 위에 있는 트럭들의 무게 총합

		LinkedList<Truck> trucks = new LinkedList<>();	//	대기중인 트럭들
		LinkedList<Truck> bridge = new LinkedList<>();	//	다리위에 있는 트럭들

		for (int t : truck_weights) {
			trucks.offer(new Truck(t,bridge_length));
		}

		while(!trucks.isEmpty() || !bridge.isEmpty()) {
			answer++;
			System.out.println("time: "+answer);
				//	다리 위에 트럭이 있을 경우 앞으로 이동
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
				
				//	다리에 새 트럭을 올릴 수 있는 경우 출발하기
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
	int weight;	//	트럭 무게
	int move;	//	다리를 건너기 위해 움직여야 하는 횟수(다리 길이)

	Truck(int weight, int move) {
		this.weight=weight;
		this.move=move;
	}
	
	@Override
	public String toString() {
		return "["+weight+","+move+"]";
	}

}