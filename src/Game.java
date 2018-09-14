import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Level level = new Level();
		Room currentRoom = level.GetStartRoom();

		while (true)
		{
			String request = input.nextLine().toLowerCase().replaceAll("\\s","");
			if (currentRoom.KeyWords.containsKey(request))
				currentRoom.KeyWords.get(request);
		}

	}

}
