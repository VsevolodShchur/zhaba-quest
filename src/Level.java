import java.awt.*;
import java.util.ArrayList;

public class Level {
    private ArrayList<Room> roomList;
    public Level (){
        roomList = new ArrayList<>();
        roomList.add(new Room());
    }
    public Level (ArrayList<Room> roomList1){
        roomList = roomList1;
    }

    public Level (String fileName){
        
    }

    public Room GetStartRoom(){
        return roomList.get(0);
    }
}