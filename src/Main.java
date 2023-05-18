import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 имен для списка А:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список А:");
        displayList(listA);

        System.out.println("Введите 5 имен для списка Б:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список Б:");
        displayList(listB);

        List<String> listC = new ArrayList<>();
        int aIndex = 0;
        int bIndex = 4;

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(aIndex));
            listC.add(listB.get(bIndex));
            aIndex++;
            bIndex--;
        }

        System.out.println("Список С:");
        displayList(listC);

    }

    private static void displayList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}