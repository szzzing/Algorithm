public class 이율계산 {

	public static void main(String[] args) {
		Saver saver1=new Saver(2000.0, 0.04);
		Saver saver2=new Saver(3000.0, 0.05);
		Saver[] savers=new Saver[]{saver1, saver2};
		umr(savers);

	}

	public static void umr(Saver[] saver) {
		System.out.print("\t");
		for(int i=0;i<saver.length;i++) {
			System.out.print("\tsaver"+(i+1));
		}
		System.out.println();
		for(int i=0;i<13;i++) {
			if(i==0) System.out.print("Base :\t\t");
			else System.out.print("Month "+i+":"+"\t");
			for(Saver s : saver) {
				System.out.printf("%.2f\t",s.mon[i]);
			}
			System.out.println();
		}
	}
}

class Saver {
	double rate;
	double[] mon=new double[13];
	Saver(double money, double rate) {
		mon[0]=money;
		this.rate=rate;
		for(int i=1;i<mon.length;i++) {
			mon[i]=mon[i-1]+(mon[i-1]*rate/12);
		}
	}
}