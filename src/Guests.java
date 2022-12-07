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
    public static void guestsList() {
        int k = Guests.createNewUserID(guests)-1;
        for (int i = 1; i<=k; i++){
            System.out.println("Гость №"+i+": " + guests.get(i));
        }
    }

    //создаем новый id для добавления нового гостя
    public static Integer createNewUserID(HashMap<Integer, List<String>> guestsStorage) {
        Integer counter = null;
        for (Map.Entry<Integer, List<String>> entry: guests.entrySet()) {
            List<String> value = new ArrayList<>();
            value.add("empty");
            if (value.equals(entry.getValue())) {
                counter = entry.getKey();
            }
        }
        if (counter == null){
            counter = guestsStorage.size() + 1;
        }
        return counter;
    }

    //поиск гостя по id
    public static HashMap<Integer, List<String>> searchGuest(int id) {
        if (guests.containsKey(id)){
            System.out.println("Под этим номером нашелся Гость:\n" + guests.get(id));
        }
        else {
            System.out.println("Такого номера нет в базе!");
        }
        return guests;
    }

    //удаление гостя по id
    public static HashMap<Integer, List<String>> deleteGuest(int id) {
        if (guests.containsKey(id)){
            System.out.println("Гость:\n" + guests.get(id) + "  был удален из базы.");
            guests.put(id, new ArrayList<String>(Arrays.asList("empty")));
        }
        else {
            System.out.println("Такого номера нет в базе!");
        }
        return guests;
    }

    //изменение ФИО гостя
    public static HashMap<Integer, List<String>> changeName(Integer guestID, String guestName) {
        List<String> guestInfo = new ArrayList<>();
        System.out.println("Гость: " + guests.get(guestID));
        guestInfo=guests.get(guestID);
        String oldName=guestInfo.get(0);
        guestInfo.set(0,guestName);
        guests.put(guestID, guestInfo);
        System.out.println("ФИО гостя "+guestID+" изменено с <"+oldName+"> на <"+guestInfo.get(0)+">");
        System.out.println("Полные новые данные гостя: <"+guests.get(guestID)+">");
        return guests;
    }
    //изменение возраста гостя
    public static HashMap<Integer, List<String>> changeAge(Integer guestID, String guestAge) {
        List<String> guestInfo = new ArrayList<String>();
        System.out.println("Гость: " + guests.get(guestID));
        guestInfo = guests.get(guestID);
        String oldAge = guestInfo.get(1);
        guestInfo.set(1, guestAge);
        guests.put(guestID, guestInfo);
        System.out.println("Возраст гостя " + guestID + " изменен с <" + oldAge + "> на <" + guestInfo.get(1) + ">");
        System.out.println("Полные новые данные гостя: <" + guests.get(guestID) + ">");
        return guests;
    }

    //изменение пола гостя
    public static HashMap<Integer, List<String>> changeSex(Integer guestID, String guestSex) {
        List<String> guestInfo = new ArrayList<String>();
        System.out.println("Гость: " + guests.get(guestID));
        guestInfo = guests.get(guestID);
        String oldSex = guestInfo.get(2);
        guestInfo.set(2, guestSex);
        guests.put(guestID, guestInfo);
        System.out.println("Пол гостя " + guestID + " изменен с <" + oldSex + "> на <" + guestInfo.get(2) + ">");
        System.out.println("Полные новые данные гостя: <" + guests.get(guestID) + ">");
        return guests;
    }

    //добавление нового гостя с консоли
    public static HashMap<Integer, List<String>> addGuestConsole(String nameGuest, String ageGuest, String sexGuest){
        ArrayList<String> guestData = new ArrayList<>();
        guestData.add(nameGuest);
        guestData.add(ageGuest);
        guestData.add(sexGuest);
        Integer idGuest = createNewUserID(guests);
        guests.put(idGuest, guestData);
        System.out.println("Гость: " + nameGuest + " возраста: " + ageGuest + " пола: " + sexGuest + " добавлен в базу под номером: " + idGuest);
        return guests;
    }

    //расселение гостей по комнатам
    public static HashMap<Integer, Integer> giveGuestsRooms(HashMap<Integer, List<String>> rooms) {
        Random r = new Random();
        ArrayList<Integer> roomNumbers = new ArrayList<>(rooms.keySet());
        HashMap<Integer, Integer> booking = new HashMap<>();
        for (Integer i = 0; i < guests.size(); i++) {
            Integer roomNumber = r.nextInt(roomNumbers.size());
            booking.put(i, roomNumbers.get(roomNumber));
            roomNumbers.removeIf(element -> element.equals(roomNumbers.get(roomNumber)));
        }
        return booking;
    }

    //тут будет вывод одного соответвия гость-комната


    public static void main() {

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

    }
}
