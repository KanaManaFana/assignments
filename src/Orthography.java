import java.util.Scanner;

public class Orthography {
//    https://acmp.ru/index.asp?main=task&id_task=940

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        StringBuilder sb = new StringBuilder(scanner.next().toUpperCase());

       System.out.println( sb.deleteCharAt(a-1));
    }
}
