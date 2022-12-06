import java.util.*;

public class Rooms {
    public static HashMap<String, List<String>> rooms = new HashMap<>();

    public void addRooms(String idRoom, ArrayList dataRoom) {
        rooms.put(idRoom, dataRoom);
    }

    public void roomsList() {
        for (Map.Entry<String, List<String>> entry: rooms.entrySet()){
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("Комната № "+ key + ": " + value);
        }
    }

    public static Rooms main() {
        Rooms rooms = new Rooms();
        rooms.addRooms("room_ID_001", new ArrayList<String>(Arrays.asList("двухместный", "без детей", "1 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_002", new ArrayList<String>(Arrays.asList("одноместный", "без детей", "1 этаж, вид на город, wi-fi")));
        rooms.roomsList();
        return rooms;
    }





}
