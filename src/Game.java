import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

	private static Scanner input = new Scanner(System.in);
	private static Map<String, Action> commonCommands = new HashMap<String, Action>();
	private static Level level = new Level();
	private static Room currentRoom = level.GetStartRoom();

	public static void main(String[] args) {

		while (true) {
			System.out.println(currentRoom.getDescription());
			String[] requestWords = getWords();
			Action action = getAction(requestWords);

			if (action != null) {
				action.Act();
			}
		}
	}

	public static Action getAction(String[] words) {
		Action action = null;

		for (String word : words) {
			// проверяем если ли слова в общих командах
			if (commonCommands.containsKey(word)) {
				Action act = commonCommands.get(word);
				if (action == null || action == act)
					action = act;
				else {
					// если слов несколько сообщаем об этом и ничего не делаем
					System.out.println("Вы должны выбрать только одно действие!");
					action = null;
					break;
				}
			}
		}
		//если нашли слово в общих командах, то отправляем команду
		if (action != null)
			return action;

		// иначе проверяем уже среди команд комнаты
		for (String word : words) {
			if (currentRoom.KeyWords.containsKey(word)) {
				Action act = currentRoom.KeyWords.get(word);
				if (action == null || action == act)
					action = act;
				else {
					System.out.println("Вы должны выбрать только одно действие!");
					action = null;
					break;
				}
			}
		}
		return action;
	}
	
	public static String[] getWords() {
		// Later we can change our input to Alice or whatever we want
		return input.nextLine().toLowerCase().split(" ");// .replaceAll("\\s","");
	}

}
