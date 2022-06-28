package application;

import entities.Trabalhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Trabalhador> list = new ArrayList<>();

        System.out.println("Informe o número de trabalhadores a ser cadastrado (5 ou mais): ");
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++){
            System.out.println("Trabalho #" + i + " dados:");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Horas Trabalhada: ");
            double horasTr = scanner.nextInt();
            System.out.print("Valor da Hora: ");
            double valorHora = scanner.nextDouble();
            list.add(new Trabalhador(nome, horasTr, valorHora));

            System.out.println();
            System.out.println("SALARIO DOS TRABALHADORES:");
            for (Trabalhador trabalhador : list){
                System.out.println(trabalhador.toString());
            }
        }
    }
}
