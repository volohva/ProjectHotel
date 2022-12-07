import java.util.*;

//основной класс нашего проекта
public class Hotel {
    //тут будет метод расселяющий гостей по комнатам
    /*public static HashMap<Integer, Integer> giveGuestsRooms(HashMap<Integer, List<String>> guests, HashMap<Integer, List<String>> rooms) {
        Random r = new Random();
        ArrayList<Integer> roomNumbers = new ArrayList<>(rooms.keySet());
        HashMap<Integer, Integer> booking = new HashMap<>();
        for (Integer i = 0; i < guests.size(); i++) {
            Integer roomNumber = r.nextInt(roomNumbers.size());
            booking.put(i, roomNumbers.get(roomNumber));
            roomNumbers.removeIf(element -> element.equals(roomNumbers.get(roomNumber)));
        }
        return booking;
    }*/

    //тут будет метод рандомно или по значению выводящий в консоль некого гостя в некой комнате

    public static void main(String args[]) {

        //тут будут switchcase для работы с консолью
        /*Rooms.main();
        HashMap<String, List<String>> rooms = new HashMap<>();
        rooms = Rooms.rooms;
        System.out.println(rooms.get("room_ID_001"));

        Guests.main().guestsList();
        HashMap<Integer, List<String>> guests = new HashMap<>();
        guests = Guests.guests;
        Integer newID = Guests.main().createNewUserID(guests);
        System.out.println(newID);*/

        //HashMap<Integer, List<String>> guests = new HashMap<>();
        //guests = Guests.main().guests;
        //HashMap<Integer, List<String>> rooms = new HashMap<>();
        //rooms = Rooms.main().rooms;

        //инициализация бд гостей
        Guests.main();

        Scanner in = new Scanner(System.in);
        System.out.println("Для выбора нужной команды нажмите соответствующую ей цифру:\n1 - печать списка всех комнат\n" +
                "2 - печать списка всех гостей\n" + "3 - добавление нового гостя в базу\n");
        int tag = in.nextInt();

        switch (tag){
            case (1):
                Rooms.main().roomsList();
                break;
            case (2):
                Guests.guestsList();
                break;
            case (3):{
                Scanner newGuest = new Scanner(System.in);
                System.out.println("Введите ФИО нового гостя: ");
                String nameGuest = newGuest.nextLine();
                System.out.println("Введите возраст нового гостя: ");
                String ageGuest = newGuest.nextLine();
                System.out.println("Введите пол нового гостя: ");
                String sexGuest = newGuest.nextLine();
                Guests.addGuestConsole(nameGuest, ageGuest, sexGuest);
                break;
            }
            default:
                System.out.println("Введенной вами команды не существует!");
                break;
        }
        in.close();

        //HashMap<Integer, Integer> guestsInRooms = new HashMap<>();
        //guestsInRooms = giveGuestsRooms(guests, rooms);






        //HashMap<Integer, List<String>> ourGuests = new HashMap<>();
        //ourGuests = Guests.guests;

        //Guests.guestsList();
        //Guests.changeName(3, "Алеша");
        //Guests.guestsList();
        //Guests.addGuestConsole("jvnb", "kjnb", "hjjh");
        Guests.guestsList();
        //Rooms.main().roomsList();
        //System.out.println();
    }
}
