public class App {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese niz brojeva (double ili
		 * cijelih, vi odluèite). Nakon što je korisnik unio niz brojeva (niz !=
		 * array, ne nužno), program treba da vrati:
		 */
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

	}

	
	/*
	 * Metoda treba da vrati: Unijeti niz,sortiran od najmanjeg ka najveæem
	 * broju
	 */
	public static void sortArray(int[] array) {

	}
}