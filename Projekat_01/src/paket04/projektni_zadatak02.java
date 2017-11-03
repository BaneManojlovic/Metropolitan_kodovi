package paket04;

public class projektni_zadatak02 {

	//Metoda za izracunavanje SumN
	static int IzracunavanjeSumN(int n, int SumN){
		for(int i=0; i<=n; i++){
			SumN +=i;
		}
		return SumN;
	}
	
	public static void main(String[] args) {
		int n=2, m=3, k, SumN=0, SumM=0, SumK=0;
		double x, y, z, F=0;
		x = IzracunavanjeSumN(n, SumN);
		y = IzracunavanjeSumN(m, SumM);
		System.out.println("SumN = " + x);
		System.out.println("SumM = " + y);
		k=n*m;
		System.out.println("k = " + k);
		if(k == -1){
			System.out.println("Broj k je -1, imenilac je 0 pa resenje nije racionalan broj. "
								+ "Unesite ponovo n ili m.");
		}
		z = IzracunavanjeSumN(k, SumK);
		System.out.println("SumK = " + z);
		F=x*y/z;
		System.out.println("F = " + F);
	}

}
