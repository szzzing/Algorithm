import java.util.*;

public class n2588 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum1=0, sum2=0;
		int A=scanner.nextInt();		//	(1)
		String B=scanner.next();		//	(2)

		for (int i=1,j=1;i<=B.length();i++,j*=10) {
			sum1=A*(B.charAt(B.length()-i)-'0');
			System.out.println(sum1);	//	(3),(4),(5)�� ��µ� ��
			sum1*=j;					//	(3),(4),(5)�� ���� (6)���� ����� ���� ����
			sum2+=sum1;					//	(6)�� ����� �����
		}
		System.out.println(sum2);


	}	//	end of main
}	//	end of class
