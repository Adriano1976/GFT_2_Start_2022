import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Construindo uma matriz:");
        System.out.print("Informe o número de linhas: ");
        int n = scanner.nextInt();
        System.out.print("Informe o número de colunas: ");
        int m = scanner.nextInt();

        int[][] num = new int[m][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m;j++ ){
                System.out.println("Informe um número:  ");
                num[i][m] = scanner.nextInt();

            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++ ){
                System.out.print([i][j]);
            }
        }

        scanner.close();
    }
}