package paket04;

public class projektni_zadatak01 {
	
	//Metoda za izracunavanje SumN
	static int IzracunavanjeSumN(int n, int SumN){
		//int SumN=0;
		for(int i=0; i<=n; i++){
			SumN +=i;
		}
		System.out.println("SumN = " + SumN);
		return SumN;
	}
	
	//Metoda za izracunavanje SumM
	static int IzracunavanjeSumM(int m, int SumM){
		//int SumM=0;
		for(int i=0; i<=m; i++){
			SumM +=i;
		}
		System.out.println("SumM = " + SumM);
		return SumM;
	}
	
	//Metoda za izracunavanje SumK
		static int IzracunavanjeSumK(int k, int SumK){
			//int SumK=0;
			for(int i=0; i<=k; i++){
				SumK +=i;
			}
			System.out.println("SumK = " + SumK);
			return SumK;
		}
	
	public static void main(String[] args) {
		int n=5, m=8, k, SumN=0, SumM=0, SumK=0;
		double x, y, z, F=0;
		x = IzracunavanjeSumN(n, SumN);
		y = IzracunavanjeSumM(m, SumM);
		k=n*m;
		System.out.println("k = " + k);
		if(k == -1){
			System.out.println("Broj k je -1, imenilac je 0 pa resenje nije racionalan broj. Unesite ponovo n ili m.");
		}
		z = IzracunavanjeSumK(k, SumK);
		//F = SumN*SumM/SumK;
		F=x*y/z;
		System.out.println("F = " + F);
	}

}
