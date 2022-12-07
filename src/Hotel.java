import java.util.*;

//основной класс нашего проекта
public class Hotel {

    public static void main(String args[]) {

        //инициализация бд гостей
        Guests.main();

        //предлставление выбора пользователю
        int tag = 1;
        while (tag !=0) {
            tag = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("\n"+"Для выхода из программы нажмите 0.\n" + "Для выбора нужной команды нажмите соответствующую ей цифру:\n1 - печать списка всех комнат\n" +
                    "2 - печать списка всех гостей\n" + "3 - добавление нового гостя в базу\n" + "4 - изменить имя гостя в базе\n"+
                    "5 - изменить возраст гостя в базе\n" + "6 - изменить пол гостя в базе\n" +
                    "7 - найти гостя по id\n" + "8 - удалить гостя по id\n");
            tag = in.nextInt();

            switch (tag){
                case (0):
                    System.out.println("Работа завершена.");
                    break;
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
                case (4):{
                    Scanner id = new Scanner(System.in);
                    System.out.println("Введите id гостя: ");
                    Integer idGuest = id.nextInt();
                    Scanner newName = new Scanner(System.in);
                    System.out.println("Введите новоe имя гостя: ");
                    String nameGuest = newName.nextLine();
                    Guests.changeName(idGuest, nameGuest);
                    break;
                }
                case (5):{
                    Scanner id = new Scanner(System.in);
                    System.out.println("Введите id гостя: ");
                    Integer idGuest = id.nextInt();
                    Scanner newAge = new Scanner(System.in);
                    System.out.println("Введите новый возраст гостя: ");
                    String ageGuest = newAge.nextLine();
                    Guests.changeAge(idGuest, ageGuest);
                    break;
                }
                case (6):{
                    Scanner id = new Scanner(System.in);
                    System.out.println("Введите id гостя: ");
                    Integer idGuest = id.nextInt();
                    Scanner newSex = new Scanner(System.in);
                    System.out.println("Введите новый пол гостя: ");
                    String sexGuest = newSex.nextLine();
                    Guests.changeSex(idGuest, sexGuest);
                    break;
                }
                case (7):{
                    Scanner id = new Scanner(System.in);
                    System.out.println("Введите id гостя: ");
                    Integer idGuest = id.nextInt();
                    Guests.searchGuest(idGuest);
                    break;
                }
                case (8):{
                    Scanner id = new Scanner(System.in);
                    System.out.println("Введите id гостя: ");
                    Integer idGuest = id.nextInt();
                    Guests.deleteGuest(idGuest);
                    break;
                }
                default:
                    System.out.println("Введенной вами команды не существует!");
                    break;
            }
        }
    }
}
