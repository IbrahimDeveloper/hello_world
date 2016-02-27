import java.util.Random;

public class PharseOMatic {
	public static void main(String[] args) {

		//Creating two String lists.
		String[] zooNamesList = {"Lion", "Tiger", "Elephant", "Gorela", "Heyna", "Wild dogs", "Crocdile"};
		String[] familyNamesList = {"Musab", "Ibrahim", "Aisha", "Abdi rauuf", "Fadumo", "Mohamed", "Maryan"};
		String[] dbzNamesList = {"Goku", "Vegeta", "Bulma", "Mr_Roshi", "Baby", "Beerus", "Champa"};
		
		
		//Genreating random numbers.
		Random range = new Random();
		int roundomNumber1 = range.nextInt(7);
		int roundomNumber2 = range.nextInt(7);
		int roundomNumber3 = range.nextInt(7);
		//Now create the awesome pharse.
		String pharse = zooNamesList[roundomNumber1] + " " + familyNamesList[roundomNumber2] + " " + dbzNamesList[roundomNumber3];

		//Printing the pharse we just created.
		System.out.println("Some random names: " + pharse);
		
	}
}
