package paket03;

import java.util.Scanner;

public class forum04 {

	public static void main(String[] args) {
		System.out.println("Domaci zadatak broj 2\n");
		//Palim Scanner klasu koji omocucava prijem korisnikovog unosa sa tastature
		Scanner sc = new Scanner(System.in);
		int x;
		//Otvaram do-while petlju koja treba da ponavlja izvrsenje programa sve dok se ne ispuni zadati uslov
		do
		{
		System.out.println("Unesite broj n: \n");
		//Zadajem promenljivu n i pozivam ugradjenu funkciju (nextInt()) koja cita prvi sledeci int 
		//koji korisnik unese na tastaturi.
		int n;
		n = sc.nextInt();
		System.out.println("Neparni brojevi su:");
		//int brojacNeparnih=0;
		int[] nizNeparnih = new int[11];
		//For petlja za prolazak kroz niz brojeva od 1 do n i if petlja koja odabira samo NEPARNE 
		//brojeve i potom ih ispisuje.
		for (int i = 1; i <=n; i++) {
			if(i%2!=0)
				System.out.println(i);
		//		brojacNeparnih ++;
				nizNeparnih[i] = i;
		}
		System.out.println("Broj neparnih brojeva u nizu je: " + nizNeparnih);
		//Pitam korisnika da li zeli da ponovi unos broja n
		System.out.println("Zelite li da ponovite unos? [DA=1 / NE=0] ");
		x = sc.nextInt();
		//Zatvaram do-while petlju zadatim uslovom
		}while(x != 0);
		
		//Zavrsavam program i zatvaram Scanner klasu.
		System.out.println("\nKraj programa!!!");
		sc.close(); 
	}

}
