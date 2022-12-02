import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rooms {
    static Map<String, List<String>> rooms = new HashMap<>();

    public void addRooms(String idRoom, ArrayList dataRoom) {
        rooms.put(idRoom, dataRoom);
    }

    public void roomsList() {
        for (String key: rooms.keySet()){
            System.out.println("Комната № "+ key + ": " + rooms.keySet());
        }
    }


}
