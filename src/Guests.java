import java.util.*;

public class Guests {

    static Map<Integer, List<String>> guests = new HashMap<>();

    public void addGuest(Integer idGuest, ArrayList dataGuest) {
        guests.put(idGuest, dataGuest);
    }

    public void guestsList() {
        for (int i = 1; i<=2; i++){
            System.out.println("Гость №"+i+": " + guests.get(i));
        }
    }




}
