import java.util.*;

public class Guests {

    public static HashMap<Integer, List<String>> guests = new HashMap<>();

    public void addGuest(Integer idGuest, ArrayList dataGuest) {
        guests.put(idGuest, dataGuest);
    }

    public void guestsList() {
        for (int i = 1; i<=2; i++){
            System.out.println("Гость №"+i+": " + guests.get(i));
        }
    }
    public static Guests main() {
        Guests guests = new Guests();
        guests.addGuest(1, new ArrayList<String>(Arrays.asList("Рыбаков Игорь Владимирович", "28", "м")));
        guests.addGuest(2, new ArrayList<String>(Arrays.asList("Сибгатуллов Шамиль Раильевич", "64", "м")));

        guests.guestsList();
        return guests;
    }




}
