import java.util.Arrays;

public class ���α׷��ӽ�_�ζ����ְ�������������� {
	public static void main(String[] args) {
		solution(new int[]{44,1,0,0,31,25}, new int[]{31,10,45,1,6,19});
	}

	public static int[] solution(int[] lottos, int[] win_Nums) {
		int[] answer = new int[2];
		int m = 0;	//	���� ��ȣ�� ����
		int z = 0;	//	�˾ƺ� �� ���� ��ȣ�� ����
		int s = 0;	//	answer[0]�� ���ϱ� ���� ����

		Arrays.sort(lottos);
		Arrays.sort(win_Nums);

		for(int l : lottos) {
			if(l==0) z++;
			else break;
		}

		for(int l : lottos) {
			for (int w : win_Nums) {
				if(l==w) {
					m++;
					break;
				}
				else if(l<w) {
					break;
				}
			}
		}
		
		s = m+z>1 ? m+z : 1;
		m = m>1 ? m : 1;
		answer[1] = lottos.length - m +1;
		answer[0] = lottos.length - s +1;
		
		return answer;
	}
}
