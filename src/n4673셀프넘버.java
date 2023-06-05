public class n4673¼¿ÇÁ³Ñ¹ö {

	public static void main(String[] args) {
		int num=97;
		while (num<10000) {
			if (num>=10) {
			char[] nc=String.valueOf(num).toCharArray();
				for(char c : nc) {
					num=num+(c-'0');
				}
			}
			System.out.println(num);
		}
	}	// end of main

}	// end of class
