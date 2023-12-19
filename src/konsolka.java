import java.util.Scanner;

public class konsolka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String str = "Hello " + name;
        System.out.println(str);
    }
}