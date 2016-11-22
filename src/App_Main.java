import java.util.InputMismatchException;
import java.util.Scanner;


public class App_Main {
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {

			/*
			 * Napisati program koji pita korisnika da unese niz brojeva (double ili
			 * cijelih, vi odluèite). Nakon što je korisnik unio niz brojeva (niz !=
			 * array, ne nužno), program treba da vrati:
			 */
		
		System.out.println("Unesite duzinu niza ");
		int arrayLength= exceptionArrayLength();
		
		int array [] = new int [arrayLength];
		
		System.out.println("Unesite " + arrayLength + " cijelih brojeva u niz" );
		for (int i = 0; i < array.length; i++) {
			array [i] = exceptionInputToArray();
			}
		
		
		App app = new App(array);
		
		app.smalestNum(array);
		app.largestNumArray(array);
		app.averageNumArray(array);
		app.sortArray(array);
		app.sumArray(array);
		app.uniqueNumArray(array);
			
	}
//Metoda provjerava unos korisnika i onemogucava mu da postavi duzinu niza manju od 1
public static int exceptionArrayLength (){
	
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je negativan broj
				if (unos < 1) {
					System.out.println("Pogresan unos, duzina niza mora biti minimanlno 2: ");	//ako jeste ispisi poruku
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		
			catch (Exception e) {
				System.out.println("Doslo je do greske, unesite ponovo");
				input.nextLine();
				
			}
		
		}while (inputCheck);
		return unos;
	
}
//Metoda sprecava pogresan onos korisnika
public static int exceptionInputToArray(){
	int unos = 0;	// pocetna vrijednost
	boolean inputCheck = true;	//kontrolna promjenljiva
	do {
		try {unos = input.nextInt();	//ucitavanje unosa i provjera da li je unesen znak
			inputCheck=false;							
		}
		catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
			System.out.println("Pogresan unos. Pokusajte ponovo, unesite cijele brojeve: ");
			input.nextLine();
		}
	
		catch (Exception e) {
			System.out.println("Doslo je do greske, unesite ponovo");
			input.nextLine();
			
		}
	
	}while (inputCheck);
	return unos;
}
}
