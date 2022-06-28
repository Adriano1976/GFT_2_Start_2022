import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int num, qtdade;

        System.out.print("Informe um número (3-999)");
        num = scanner.nextInt();


        if (num % 3 == 0){
            for (int i = 0; i <= 0; i++ )
                System.out.print(num);
        }
    }
}
