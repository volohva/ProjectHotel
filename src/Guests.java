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

    //тут будут методы для изменения данных гостя,
    //поиска по id и удаления из бд

    public void addGuestConsole(String nameGuest, String ageGuest, String sexGuest){
        ArrayList<String> guestData = new ArrayList<>();
        guestData.add(nameGuest);
        guestData.add(ageGuest);
        guestData.add(sexGuest);
        Integer idGuest = createNewUserID(guests);
        guests.put(idGuest, guestData);
        System.out.println("Гость: " + nameGuest + " возраста: " + ageGuest + " пола: " + sexGuest + " добавлен в базу под номером: " + idGuest);
    }

    public static Guests main() {

        Guests guests = new Guests();

        //наполнение базы данных
        guests.addGuest(1, new ArrayList<String>(Arrays.asList("Рыбаков Игорь Владимирович", "28", "мужчина")));
        guests.addGuest(2, new ArrayList<String>(Arrays.asList("Сибгатуллов Шамиль Раильевич", "64", "мужчина")));
        guests.addGuest(3, new ArrayList<String>(Arrays.asList("Коханова Надежда Павловна","52", "женщина")));
        guests.addGuest(4, new ArrayList<String>(Arrays.asList("Таран Владимир Борисович","35", "мужчина")));
        guests.addGuest(5, new ArrayList<String>(Arrays.asList("Устинкина Наталья Александровна","38", "женщина")));
        guests.addGuest(6, new ArrayList<String>(Arrays.asList("Боровков Олег Евгеньевич","37", "мужчина")));
        guests.addGuest(7, new ArrayList<String>(Arrays.asList("Савченко Алёна Васильевна","26", "женщина")));
        guests.addGuest(8, new ArrayList<String>(Arrays.asList("Макаренко Ольга Игоревна","23", "женщина")));
        guests.addGuest(9, new ArrayList<String>(Arrays.asList("Шевцова Наталья Андреевна","51", "женщина")));
        guests.addGuest(10, new ArrayList<String>(Arrays.asList("Асламов Николай Евгеньевич","74", "мужчина")));
        guests.addGuest(11, new ArrayList<String>(Arrays.asList("Тишкин Алексей Юрьевич","31", "мужчина")));
        guests.addGuest(12, new ArrayList<String>(Arrays.asList("Мокринский Михаил Геннадьевич","59", "мужчина")));
        guests.addGuest(13, new ArrayList<String>(Arrays.asList("Казанов Ярослав Валерьевич","32", "мужчина")));
        guests.addGuest(14, new ArrayList<String>(Arrays.asList("Зайцев Александр Сергеевич","38", "мужчина")));
        guests.addGuest(15, new ArrayList<String>(Arrays.asList("Швец Юлия Борисовна","43", "женщина")));
        guests.addGuest(16, new ArrayList<String>(Arrays.asList("Фролов Валентин Игоревич","36", "мужчина")));
        guests.addGuest(17, new ArrayList<String>(Arrays.asList("Вениг Сергей Борисович","52", "мужчина")));
        guests.addGuest(18, new ArrayList<String>(Arrays.asList("Стецюра Светлана Викторовна","48", "женщина")));
        guests.addGuest(19, new ArrayList<String>(Arrays.asList("Разумихина Галина Павловна","65", "женщина")));
        guests.addGuest(20, new ArrayList<String>(Arrays.asList("Санджиева Айса Эрдниевна","29", "женщина")));

        return guests;
    }
}
