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
        //String sFile = FileWorker.read("../levels/" + fileName);
        String sFile = FileWorker.read(fileName);
        System.out.println(sFile);
        String[] rawLevels = sFile.split("[{](.*)[}]");
        for (String rawLevel : rawLevels){
            System.out.println(rawLevel);
        }
    }

    public Room GetStartRoom(){
        return roomList.get(0);
    }
}