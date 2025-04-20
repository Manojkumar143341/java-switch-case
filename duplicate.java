import java.util.Scanner;

public class FruitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a fruit name: ");
        String fruit = scanner.nextLine();

        switch (fruit.toLowerCase()) {
            case "apple":
                System.out.println("Apples are red or green!");
                break;
            case "banana":
                System.out.println("Bananas are yellow!");
                break;
            case "orange":
                System.out.println("Oranges are orange!");
                break;
            default:
                System.out.println("Unknown fruit");
        }

        scanner.close();
    }
}
