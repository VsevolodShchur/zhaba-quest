import java.util.Scanner;

public class Game {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
<<<<<<< HEAD

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
=======
		Scanner input = new Scanner(System.in);
		Level level = new Level();
		Room currentRoom = level.GetStartRoom();

		while (true)
		{
			String request = input.nextLine().toLowerCase().replaceAll("\\s","");
			if (currentRoom.KeyWords.containsKey(request))
				currentRoom.KeyWords.get(request);
>>>>>>> e5eeae057396969b7d61d24454ef31d78b429634
		}
	}

	public static String[] GetWords() {
		// � ���� ������ ����� ������ ������� ���� � �����������, �� �����
		return input.nextLine().toLowerCase().split(" ");// .replaceAll("\\s","");
	}

}
