import java.util.HashMap;
import java.util.Map;

public class Room {

	public Map<String, Action> KeyWords;
	private String description;
	
	public Room(){
	    KeyWords = new HashMap<String, Action>();
	    description = "You are in an empty room.";
    }
	
	public String getDescription()
	{
		return description;
	}

}
