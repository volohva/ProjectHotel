import java.util.*;

public class Hotel {
    //тут наши методы
    public static void main(String args[]) {

        Rooms.main();
        HashMap<String, List<String>> rooms = new HashMap<>();
        rooms = Rooms.rooms;
        System.out.println(rooms.get("room_ID_001"));

        Guests.main();
        HashMap<Integer, List<String>> guests = new HashMap<>();
        guests = Guests.guests;
    }
}
