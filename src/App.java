public class App {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese niz brojeva (double ili
		 * cijelih, vi odlu�ite). Nakon �to je korisnik unio niz brojeva (niz !=
		 * array, ne nu�no), program treba da vrati:
		 */
	}

	/*
	 * Metoda treba da vrati: Najmanji broj u nizu
	 */
	public static void smalestNum(int[] array) {

	}

	/*
	 * Metoda treba da vrati: Najve�i broj u nizu
	 */
	public static void largestNumArray(int[] array) {

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
	 * Metoda treba da vrati: Prosjek brojeva u nizu
	 */
	public static void smalestNumArray(int[] array) {

	}

	/*
	 * Metoda treba da vrati: Unijeti niz,sortiran od najmanjeg ka najve�em
	 * broju
	 */
	public static void sortArray(int[] array) {

	}
}