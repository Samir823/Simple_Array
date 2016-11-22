
import java.util.Arrays;

public class App {
	
	 int [] array; 

	public App(int[] array) {//kreiranje kontruktora koji prima vrijednost
		
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	/*
	 * Metoda treba da vrati: Najmanji broj u nizu
	 */
	public void smalestNum(int[] array) {
		
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
	public void largestNumArray(int[] array) {
	
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
	public void sumArray(int[] array) {
		
		double sum = 0;
		for (int i = 0; i < array.length; i++ ) {
			sum += array[i];
		}
		System.out.printf("Suma svih brojeva u nizu je %.2f.",sum);
	}

	/*
	 * Metoda treba da vrati: Prosjek brojeva u nizu
	 */

	public void averageNumArray(int[] array) {
		
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
	public void uniqueNumArray(int[] array) {
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
	public void sortArray(int[] array) {
		int[] sortiran = array.clone();
		Arrays.sort(sortiran);
		System.out.println("Sorted: ");
		for (int i : sortiran) {
			System.out.print(i + " ");
		}
	}
	//Metoda provjerava unos korisnika i onemogucava mu da postavi duzinu niza manju od 1
	
}
		
	

