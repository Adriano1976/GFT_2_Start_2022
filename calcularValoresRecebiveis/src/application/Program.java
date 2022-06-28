package application;

import entities.Promissoria;
import entities.Recebivel;
import entities.Cheque;
import entities.TituloDeGoverno;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Recebivel> list = new ArrayList<>();

        System.out.println();
        System.out.print("Digite o número de recebíveis: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o tipo recebível: \nc - cheque\np - promossória\nt - Título de Governo: ");
            System.out.print("Tipo: ");
            char tipo = scanner.next().charAt(0);
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            System.out.print("Prazo: ");
            int prazo = scanner.nextInt();
            if (tipo == 'c' || tipo == 'C'){
                list.add(new Cheque(valor, prazo));
            } else if (tipo == 'p' || tipo == 'P') {
                list.add(new Promissoria(valor, prazo));
            } else if (tipo == 't' || tipo == 'T') {
                list.add(new TituloDeGoverno(valor, prazo));
            } else {
                System.out.println("Tipo recebível incorreto.");
            }
        }

        System.out.println();
        System.out.println("Valores recebidos: ");
        for (Recebivel recebivel : list){
            System.out.println("R$ " + String.format("%.2f", recebivel.valorRecebivel()));
        }
    }
}
