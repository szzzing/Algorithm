public class 프로그래머스_2020카카오인턴십_키패드누르기 {

	public static void main(String[] args) {

	}


	public String solution(int[] numbers, String hand) {
		String answer = "";
		int left = 10;
		int right = 12;

		for(int i=0 ; i<numbers.length ; i++) {
			if(numbers[i]==0) numbers[i]=11;
		}

		for(int n : numbers) {

			if(n==2 || n==5 || n==8 || n==11) {
				int d = (Math.abs(left-n)%3+Math.abs(left-n)/3) - (Math.abs(right-n)%3+Math.abs(right-n)/3);

				if(d==0) {
					left = hand.equals("left") ? n : left;
					right = hand.equals("right") ? n : right;
					answer += hand.equals("left") ? "L" : "R";
				}
				else {
					left = d<0 ? n : left;
					right = d>0 ? n : right;
					answer += d<0 ? "L" : "R";
				}
			}

			else {
				left = (n==1 || n==4 || n==7) ? n : left;
				right = (n==3 || n==6 || n==9) ? n : right;
				answer += (n==1 || n==4 || n==7) ? "L" : "R";
			}
		}

		return answer;
	}
}