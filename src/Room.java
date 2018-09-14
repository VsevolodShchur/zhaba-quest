import java.util.HashMap;
import java.util.Map;

public class Room {

	private Map<String, Action> KeyWords = new HashMap<String, Action>();
	public Action getKeyWords(String key)
	{
		return KeyWords.get(key);
	}


}
