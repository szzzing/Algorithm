public class 프로그래머스_2019카카오개발자겨울인턴십_징검다리건너기 {

	public static void main(String[] args) {

		int[] stones= {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		int k= 3;
		System.out.println(solution(stones,k));
	}
	
	
	


	public static int solution(int[] stones, int k) {
		int answer=0;
		boolean cross=true;
		int count;

		while(cross) {

			count=0;

			for(int i=0;i<stones.length;i++) {
				stones[i]--;

				if(stones[i]<0) {
					count++;
				}
				else {
					count=0;
				}

				if(count==k) {
					cross=false;
					break;
				}
			}
			answer += cross ? 1 : 0;
		}


		return answer;
	}



	public static int solution2(int[] stones, int k) {
		int answer=0;
		int min=1;
		int max=200000000;
		int mid=0;

		while(min<=max) {
			mid=(max+min)/2;
			if(cross(mid, stones, k)) {
				min=mid+1;
				answer=mid;
			}
			else {
				max=mid-1;
			}
		}
		return answer;
	}
	


	public static boolean cross(int friends, int[] stones, int k) {
		int count=0;

		for (int stone:stones) {
			if (friends>stone) {
				count++;
			}
			else {
				count=0;
			}

			if (count==k) {
				return false;
			}
		}

		return true;
	}
	
	public static void binarySearch(int max, int min, boolean biggerValue) {
		int mid;
		
		while (min<=max) {
			mid=(max+min)/2;
			
			if (biggerValue) {
				min=mid+1;
			}
			else {
				max=mid-1;
			}
		}
	}
}