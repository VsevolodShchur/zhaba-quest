import java.util.Scanner;

public class Game {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Level level = new Level();
		Room currentRoom = level.GetStartRoom();

		while (true) {
			String[] requestWords = GetWords();

			Action action = null;
			for (String word : requestWords) {
				if (currentRoom.KeyWords.containsKey(word)) {
					Action act = currentRoom.KeyWords.get(word);
					if (action == null || action == act)
						action = act;
					else {
						System.out.println("�������� ���-�� ����");
						action = null;
						break;
					}
				}
			}
			if (action != null) {
				action.Act();
				// �� ����������� ��null���, �� �� ������ ������
				action = null;
			}
		}
	}

	public static String[] GetWords() {
		// � ���� ������ ����� ������ ������� ���� � �����������, �� �����
		return input.nextLine().toLowerCase().split(" ");// .replaceAll("\\s","");
	}

}
