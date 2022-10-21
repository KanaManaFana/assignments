import java.util.Scanner;

public class ProgrammerDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int a;

        if (number % 400 == 0 || number % 4 == 0 && number % 100 != 0) System.out.println("12/09/");
        else System.out.println("13/09/");

    }
}
