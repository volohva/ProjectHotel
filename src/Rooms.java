import java.util.*;

//класс, определяющий работу с комнатами
public class Rooms {

    //наша база данных для хранения комнат
    public static HashMap<Integer, List<String>> rooms = new HashMap<>();

    //метод для добавления комнаты в базу данных
    public void addRooms(Integer idRoom, ArrayList dataRoom) {
        rooms.put(idRoom, dataRoom);
    }

    //метод выводящий список всех комнат из базы данных
    public void roomsList() {
        for (Map.Entry<Integer, List<String>> entry: rooms.entrySet()){
            Integer key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("Комната № "+ key + ": " + value);
        }
    }

    public static Rooms main() {

        Rooms rooms = new Rooms();

        //наполнение базы данных
        rooms.addRooms(101, new ArrayList<>(Arrays.asList("двухместный", "без детей", "сomfort", "1 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms(102, new ArrayList<>(Arrays.asList("одноместный", "без детей", "standard", "1 этаж, вид на город, wi-fi")));
        rooms.addRooms(103, new ArrayList<>(Arrays.asList("трехместный", "с детьми", "standard","1 этаж, вид на город, wi-fi")));
        rooms.addRooms(104, new ArrayList<>(Arrays.asList("одноместный", "с детьми", "standard", "1 этаж, вид на город, wi-fi")));
        rooms.addRooms(105, new ArrayList<>(Arrays.asList("двухместный", "с детьми, спальное место для ребенка по запросу", "standard", "1 этаж, вид на город, wi-fi")));
        rooms.addRooms(201, new ArrayList<>(Arrays.asList("двухместный", "с детьми, спальное место для ребенка по запросу", "standard", "2 этаж, вид на город, wi-fi")));
        rooms.addRooms(202, new ArrayList<>(Arrays.asList("двуместный", "без детей", "comfort", "2 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms(203, new ArrayList<>(Arrays.asList("трехместный", "с детьми", "standard", "2 этаж, вид на город, wi-fi")));
        rooms.addRooms(204, new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "comfort", "2 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms(205, new ArrayList<>(Arrays.asList("двухместный", "без детей", "standard", "2 этаж, вид на город, wi-fi")));
        rooms.addRooms(301, new ArrayList<>(Arrays.asList("двухместный", "с детьми", "comfort", "3 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms(302, new ArrayList<>(Arrays.asList("трехместный", "с детьми", "standard", "3 этаж, вид на город, wi-fi")));
        rooms.addRooms(303, new ArrayList<>(Arrays.asList("трехместный", "с детьми", "comfort", "3 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms(304, new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "standard", "3 этаж, вид на город, wi-fi")));
        rooms.addRooms(305, new ArrayList<>(Arrays.asList("четырехместный", "с детьми", "comfort", "3 этаж, вид на сад, AC, мини-бар, wi-fi")));
        rooms.addRooms(401, new ArrayList<>(Arrays.asList("четырехместный", "без детей", "comfort", "мансарда (4 этаж), вид на город, AC, телевизор 60'', wi-fi")));
        rooms.addRooms(402, new ArrayList<>(Arrays.asList("двухместный", "без детей", "comfort", "мансарда (4 этаж), вид на сад, АС, мини-бар, wi-fi")));
        rooms.addRooms(403, new ArrayList<>(Arrays.asList("двухместный", "без детей", "comfort", "мансарда (4 этаж), вид на сад, АС, мини-бар, wi-fi")));
        rooms.addRooms(404, new ArrayList<>(Arrays.asList("двухместный", "без детей", "luxury", "мансарда (4 этаж), вид на сад, АС, гидромассажная ванна, мини-бар, wi-fi")));
        rooms.addRooms(405, new ArrayList<>(Arrays.asList("двухместный", "без детей", "luxury", "мансарда (4 этаж), вид на сад, АС, гидромассажная ванна, мини-бар, wi-fi")));

        return rooms;
    }
}
