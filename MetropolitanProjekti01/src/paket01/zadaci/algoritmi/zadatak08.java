package paket01.zadaci.algoritmi;

public class zadatak08 {
	//Zadatak 8 - Faktorijal broja.
	
	//funkcija koja izracunava faktorijal broja
	public static void faktorijal(int NUMBER, int FAKTORIJAL){
		for(int i=1; i<=NUMBER; i++){
			FAKTORIJAL = FAKTORIJAL * i;
		}
		System.out.println(FAKTORIJAL);
		return;
	}

	public static void main(String[] args) {
		
		int NUMBER=5, FAKTORIJAL = 1;
		System.out.println("Faktorijal broja NUMBER = "+ NUMBER + " je: ");
		
		//poziv funkcije koja izracunava faktorijal
		faktorijal(NUMBER, FAKTORIJAL);

	}

}
