import java.util.*;

//класс, определяющий работу с гостями
public class Guests {

    //наша база данных для хранения гостей
    public static HashMap<Integer, List<String>> guests = new HashMap<>();

    //метод для добавления гостя в базу данных, используется в главной функции этого класса
    public void addGuest(Integer idGuest, ArrayList dataGuest) {

        guests.put(idGuest, dataGuest);
    }

    //метод выводящий список всех гостей из базы данных
    public void guestsList() {
        int k = Guests.createNewUserID(guests)-1;
        for (int i = 1; i<=k; i++){
            System.out.println("Гость №"+i+": " + guests.get(i));
        }
    }

    //создаем новый id для добавления нового гостя
    public static Integer createNewUserID(HashMap<Integer, List<String>> guestsStorage) {
        Integer counter = guestsStorage.size();
        return counter + 1;
    }

    //тут будут методы для добавления нового гостя с консоли, изменения его данных,
    //поиска по id и удаления из бд

    public static Guests main() {

        Guests guests = new Guests();

        //наполнение базы данных
        guests.addGuest(1, new ArrayList<String>(Arrays.asList("Рыбаков Игорь Владимирович", "28", "м")));
        guests.addGuest(2, new ArrayList<String>(Arrays.asList("Сибгатуллов Шамиль Раильевич", "64", "м")));


        return guests;
    }
}
