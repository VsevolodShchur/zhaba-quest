import java.util.Scanner;

public class Game {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Room currentRoom = new Room();

		while (true) {
			String[] requestWords = GetWords();

			Action action = null;
			for (String word : requestWords) {
				if (currentRoom.KeyWords.containsKey(word)) {
					Action act = currentRoom.KeyWords.get(word);
					if (action == null || action == act)
						action = act;
					else {
						System.out.println("Выберите что-то одно");
						action = null;
						break;
					}
				}
			}
			if (action != null) {
				action.Act();
				// не обязательно обnullять, но на всякий случай
				action = null;
			}
		}
	}

	public static String[] GetWords() {
		// В этом методе потом сможем сменить ввод с консольного, на Алису
		return input.nextLine().toLowerCase().split(" ");// .replaceAll("\\s","");
	}

}
