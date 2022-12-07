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
        rooms.addRooms("room_ID_001", new ArrayList<>(Arrays.asList("двухместный", "без детей", "сomfort", "1 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_002", new ArrayList<>(Arrays.asList("одноместный", "без детей", "standard", "1 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_003", new ArrayList<>(Arrays.asList("трехместный", "с детьми", "standard","2 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_004", new ArrayList<>(Arrays.asList("одноместный", "с детьми", "standard", "2 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_005", new ArrayList<>(Arrays.asList("двухместный", "с детьми, спальное место для ребенка по запросу", "standard", "1 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_006", new ArrayList<>(Arrays.asList("двухместный", "с детьми, спальное место для ребенка по запросу", "standard", "2 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_007", new ArrayList<>(Arrays.asList("двуместный", "без детей", "comfort", "2 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_008", new ArrayList<>(Arrays.asList("трехместный", "с детьми", "standard", "2 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_009", new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "comfort", "2 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_010", new ArrayList<>(Arrays.asList("двухместный", "без детей", "standard", "3 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_011", new ArrayList<>(Arrays.asList("двухместный", "с детьми", "comfort", "3 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_012", new ArrayList<>(Arrays.asList("трехместный", "с детьми", "standard", "3 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_013", new ArrayList<>(Arrays.asList("трехместный", "с детьми", "comfort", "3 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_014", new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "standard", "3 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_015", new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "comfort", "3 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_016", new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "standard", "3 этаж, вид на город, wi-fi")));
        rooms.addRooms("room_ID_017", new ArrayList<>(Arrays.asList("двухместный", "без детей", "comfort", "мансарда (4 этаж), вид на сад, АС, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_018", new ArrayList<>(Arrays.asList("двухместный", "без детей", "comfort", "мансарда (4 этаж), вид на сад, АС, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_019", new ArrayList<>(Arrays.asList("двухместный", "без детей", "luxury", "мансарда (4 этаж), вид на сад, АС, гидромассажная ванна, мини-бар, wi-fi")));
        rooms.addRooms("room_ID_020", new ArrayList<>(Arrays.asList("двухместный", "без детей", "luxury", "мансарда (4 этаж), вид на сад, АС, гидромассажная ванна, мини-бар, wi-fi")));

        return rooms;
    }
}
