import java.util.*;

//основной класс нашего проекта
public class Hotel {
    //тут будет метод расселяющий гостей по комнатам
    //тут будет метод рандомно или по значению выводящий в консоль некого гостя в некой комнате

    public static void main(String args[]) {

        //тут будут switchcase для работы с консолью
        /*Rooms.main();
        HashMap<String, List<String>> rooms = new HashMap<>();
        rooms = Rooms.rooms;
        System.out.println(rooms.get("room_ID_001"));

        */Guests.main().guestsList();
        HashMap<Integer, List<String>> guests = new HashMap<>();
        guests = Guests.guests;
        //Integer newID = Guests.main().createNewUserID(guests);
        //System.out.println(newID);*/


//убрать потом, переменные для проверки, что метод работает.
// Нужны данные с консоли - Integer guestID, String guestName, String guestAge, String guestSex
        Integer guestID = 3;
        String guestName = "ФФФ";
        String guestAge = "46";
        String guestSex = "мужчина";

//метод - смена ФИО гостя
        Guests.changeName(guestID, guestName);
//вызов метода - смена возраста гостя
        Guests.changeAge(guestID, guestAge);
//вызов метода - смена пола гостя
        Guests.changeSex(guestID, guestSex);



        Scanner in = new Scanner(System.in);
        System.out.println("Для выбора нужной команды нажмите соответствующую ей цифру:\n1 - печать списка всех комнат\n" +
                "2 - печать списка всех гостей\n");
        int tag = in.nextInt();
        in.close();

        switch (tag){
            case (1):
                Rooms.main().roomsList();
                break;
            case (2):
                Guests.main().guestsList();
                break;
            default:
                System.out.println("Введенной вами команды не существует!");
                break;
        }

        Guests.main().guestsList();

    }


}
