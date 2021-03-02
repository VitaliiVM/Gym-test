package Studio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    private static final Random random = new Random();
    private static ArrayList<Object> names = new ArrayList<>();
    private static ArrayList<Object> group1 = new ArrayList<>();
    private static ArrayList<Object> group2 = new ArrayList<>();
    private static ArrayList<Object> group3 = new ArrayList<>();
    private static ArrayList<Object> group4 = new ArrayList<>();
    private static ArrayList<Object> group5 = new ArrayList<>();

    public static void start() throws IOException {
        boolean exit = false;
        do {
            System.out.println("Введите имя:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name;
            name = reader.readLine();
            names.add(name);

            for (int i = 0; i < names.size(); i++) {

                getRandomItem2(names);
                int index = random.nextInt(names.size());


                if (name.equalsIgnoreCase("EXIT")) {
                    exit = true;
                    reader.close();
                }
                if (index == 0) {
                    System.out.println(name + ": " + "Отправлен в группу 1");
                    group1.add(name);
                } else if (index == 1) {
                    group2.add(name);
                    System.out.println(name + ": " + "Отправлен в группу 2");
                } else if (index == 2) {
                    group3.add(name);
                    System.out.println(name + ": " + "Отправлен в группу 3");
                } else if (index == 3) {
                    group4.add(name);
                    System.out.println(name + ": " + "Отправлен в группу 4");
                } else if (index >= 4 && index < 10) {
                    group5.add(name);
                    System.out.println(name + ": " + "Отправлен в группу 5");
                }
                if (names.size() == 10) {

                    System.out.println("В группе 1 : " + group1.size() + " " + "Человек");
                    System.out.println("В группе 2 : " + group2.size() + " " + "Человек");
                    System.out.println("В группе 3 : " + group3.size() + " " + "Человек");
                    System.out.println("В группе 4 : " + group4.size() + " " + "Человек");
                    System.out.println("В группе 5 : " + group5.size() + " " + "Человек");

                }

                name = reader.readLine();
                names.add(name);
                names.get(index);

            }

        }while (!exit);

    }

    public static void main (String[]args) throws IOException {
        start();

    }

    private static void getRandomItem2 (ArrayList < Object > names) {
        int index = random.nextInt(names.size());
        names.get(index);
    }

}

