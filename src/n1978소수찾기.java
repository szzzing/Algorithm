import java.util.*;

public class n1978소수찾기 {

	public static void main(String[] args) {
		int count=0;	// 소수 개수 카운트
		String numInput=new Scanner(System.in).nextLine();
		String[] nums=numInput.split(" ");
		for(String num : nums) {
			if(isPrime(Integer.parseInt(num))) count++;
		}
		System.out.println(count);
	}	// end of main
	
	static boolean isPrime(int number) {
		if(number==1 || number==0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) return false;
		}
		return true;
	}

}
