import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os seguintes dados:");
        System.out.print("Nª de linhas: "); // Informando o número de linhas de uma matriz.
        int n = scanner.nextInt();
        System.out.print("Nª de colunas: "); // Informando o número de colunas de uma matriz.
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m]; // Declarando e inicializando uma matriz.

        System.out.println("Informe os números:  "); // Informando os valores contidos numa matriz.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(); // Realizando a quebra de linha
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  "); // Imprimindo os valores armazenados em formato de matriz.
            }
        }

        scanner.close();
    }
}
