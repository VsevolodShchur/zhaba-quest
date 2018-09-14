import java.util.Scanner;

public class Game {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Level level = new Level();
		Room currentRoom = level.GetStartRoom();

		while (true) {
			System.out.println(currentRoom.getDescription());
			String[] requestWords = getWords();

			//Need to be incapsulated later
			Action action = null;
			for (String word : requestWords) {
				if (currentRoom.KeyWords.containsKey(word)) {
					Action act = currentRoom.KeyWords.get(word);
					if (action == null || action == act)
						action = act;
					else {
						System.out.println("You must chose one option!");
						action = null;
						break;
					}
				}
			}
			if (action != null) {
				action.Act();
				//Actually there is no need to null it, but i do it just in case
				action = null;
			}
		}
	}

	public static String[] getWords() {
		//Later we can change our input to Alice or whatever we want
		return input.nextLine().toLowerCase().split(" ");// .replaceAll("\\s","");
	}

}
