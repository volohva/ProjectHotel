import java.util.*;

public class Hotel {

     //мапа для гостей
//    static Map<Integer, List<String>> guests =  new HashMap<Integer, List<String>>();

    //мапа для комнат
//    static Map<String, List<String>> rooms =  new HashMap<String, List<String>>();


    //тут наши методы



    public static void main(String args[]) {
//        guests.put(1, new ArrayList<String>(Arrays.asList("Рыбаков Игорь Владимирович", "28", "м")));
//        guests.put(2, new ArrayList<String>(Arrays.asList("Сибгатуллов Шамиль Раильевич", "64", "м")));

        //создаем гостей
        Guests guests = new Guests();
        guests.addGuest(1, new ArrayList<String>(Arrays.asList("Рыбаков Игорь Владимирович", "28", "м")));
        guests.addGuest(2, new ArrayList<String>(Arrays.asList("Сибгатуллов Шамиль Раильевич", "64", "м")));
        guests.guestsList();

//        //создаем комнаты
//        rooms.put("room_ID_001", new ArrayList<String>(Arrays.asList("двухместный", "без детей", "1 этаж, вид на сад, AC, мини-бар, wi-f")));
//        rooms.put("room_ID_002", new ArrayList<String>(Arrays.asList("одноместный", "без детей", "1 этаж, вид на город, wi-f")));

        Rooms rooms = new Rooms();
        rooms.addRooms("room_ID_001", new ArrayList<String>(Arrays.asList("двухместный", "без детей", "1 этаж, вид на сад, AC, мини-бар, wi-f")));
        rooms.addRooms("room_ID_002", new ArrayList<String>(Arrays.asList("одноместный", "без детей", "1 этаж, вид на город, wi-f")));
        rooms.roomsList();

//
//        Hotel H1 = new Hotel();
//        H1.guestList();
    }
}
