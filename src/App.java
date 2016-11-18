
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Arrays;


public class App {
	
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
	smalestNum(array);
	largestNumArray(array);
	averageNumArray(array);
	sortArray(array);
	sumArray(array);
	uniqueNumArray(array);
	
	
	
	}

	/*
	 * Metoda treba da vrati: Najmanji broj u nizu
	 */
	public static void smalestNum(int[] array) {
		
		    int minValue = array[0];
		    for (int i = 1; i < array.length; i++) {
		        if (array[i] < minValue) {
		            minValue = array[i];
		        }
		    }
		    System.out.println("Najmanji broj u nizu je " + minValue);
		}

	/*
	 * Metoda treba da vrati: Najveæi broj u nizu
	 */
	public static void largestNumArray(int[] array) {
	
		    int maxValue = array[0];
		    for (int i = 1; i < array.length; i++) {
		        if (array[i] > maxValue) {
		            maxValue = array[i];
		        }
		    }
		    System.out.println("Najveci broj u nizu je " + maxValue);
		}


	

	/*
	 * Metoda treba da vrati: Prosjek brojeva u nizu
	 */
	public static void sumArray(int[] array) {
		
		double sum = 0;
		for (int i = 0; i < array.length; i++ ) {
			sum += array[i];
		}
		System.out.printf("Suma svih brojeva u nizu je %.2f.",sum);
	}

	/*
	 * Metoda treba da vrati: Prosjek brojeva u nizu
	 */

	public static void averageNumArray(int[] array) {
		
		double sum = 0;
		for (int i = 0; i < array.length; i++ ) {
			sum += array[i];
		}
		double average = sum / array.length;
		System.out.printf("Prosjek svih brojeva u nizu je %.2f.",average);
		
	}

	/*
	 * Metoda treba da vrati: Sve unikatne brojeve u nizu
	 */
	public static void uniqueNumArray(int[] array) {
		int[] rezervni = array.clone();
		Arrays.sort(rezervni);
		System.out.println("Unique numbers in array are: ");
		try {
			System.out.print(rezervni[0] + " ");
			for (int i = 1; i < rezervni.length; i++)
				if (rezervni[i] != rezervni[i - 1])
					System.out.print(rezervni[i] + " ");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}		
	}

	
	/*
	 * Metoda treba da vrati: Unijeti niz,sortiran od najmanjeg ka najveæem
	 * broju
	 */
	public static void sortArray(int[] array) {
		int[] sortiran = array.clone();
		Arrays.sort(sortiran);
		System.out.println("Sorted: ");
		for (int i : sortiran) {
			System.out.print(i + " ");
		}
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
		
	

