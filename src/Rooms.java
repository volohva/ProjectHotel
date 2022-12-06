import java.util.*;

//класс, определяющий работу с комнатами
public class Rooms {

    //наша база данных для хранения комнат
    public static HashMap<String, List<String>> rooms = new HashMap<>();

    //метод для добавления комнаты в базу данных, используется в главной функции этого класса
    public void addRooms(String idRoom, ArrayList dataRoom) {
        rooms.put(idRoom, dataRoom);
    }

    //метод выводящий список всех комнат из базы данных
    public void roomsList() {
        for (Map.Entry<String, List<String>> entry: rooms.entrySet()){
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("Комната № "+ key + ": " + value);
        }
    }

    public static Rooms main() {

        Rooms rooms = new Rooms();

        //наполнение базы данных
        rooms.addRooms("room_ID_001", new ArrayList<String>(Arrays.asList("двухместный", "без детей", "1 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_002", new ArrayList<String>(Arrays.asList("одноместный", "без детей", "1 этаж, вид на город, wi-fi")));
        rooms.roomsList();

        return rooms;
    }
}
