<<<<<<< HEAD
package chapters.Chapter03.Exercises;

public class Exercises24 {
	public static void main(String[] args) {

		int suit = (int) (Math.random() * 3 + 1);
		int rank = (int) (Math.random() * 12 + 1);

		String card = "";
		String rankCard = "";
		{

			switch (suit) {
			case 1:
				card += "Clubs ";
				break;
			case 2:
				card += "Diamonds ";
				break;
			case 3:
				card += "Hearts ";
				break;
			case 4:
				card += "Spades ";
				break;
			}
			switch (rank) {
			case 1:
				rankCard = "Ace ";
				break;
			case 2:
				rankCard = "2 ";
				break;
			case 3:
				rankCard = "3 ";
				break;
			case 4:
				rankCard = "4 ";
				break;
			case 5:
				rankCard = "5 ";
				break;
			case 6:
				rankCard = "6 ";
				break;
			case 7:
				rankCard = "7 ";
				break;
			case 8:
				rankCard = "8 ";
				break;
			case 9:
				rankCard = "9 ";
				break;
			case 10:
				rankCard = "10 ";
				break;
			case 11:
				rankCard = "11 ";
				break;
			case 12:
				rankCard = "12 ";
				break;
			case 13:
				rankCard = "13 ";
				break;
			}

			System.out.println("The car you picked is " + rankCard + " of " + card);

		}
	}
}
=======
package chapters.Chapter03.Exercises;

public class Exercises24 {
	public static void main(String[] args) {

		int suit = (int) (Math.random() * 3 + 1);
		int rank = (int) (Math.random() * 12 + 1);

		String card = "";
		String rankCard = "";
		{

			switch (suit) {
			case 1:
				card += "Clubs ";
				break;
			case 2:
				card += "Diamonds ";
				break;
			case 3:
				card += "Hearts ";
				break;
			case 4:
				card += "Spades ";
				break;
			}
			switch (rank) {
			case 1:
				rankCard = "Ace ";
				break;
			case 2:
				rankCard = "2 ";
				break;
			case 3:
				rankCard = "3 ";
				break;
			case 4:
				rankCard = "4 ";
				break;
			case 5:
				rankCard = "5 ";
				break;
			case 6:
				rankCard = "6 ";
				break;
			case 7:
				rankCard = "7 ";
				break;
			case 8:
				rankCard = "8 ";
				break;
			case 9:
				rankCard = "9 ";
				break;
			case 10:
				rankCard = "10 ";
				break;
			case 11:
				rankCard = "11 ";
				break;
			case 12:
				rankCard = "12 ";
				break;
			case 13:
				rankCard = "13 ";
				break;
			}

			System.out.println("The car you picked is " + rankCard + " of " + card);

		}
	}
}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
