import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir os biomas do Brasil");
            System.out.println("2 - Escolha um bioma para uma visão mais detalhada");
            System.out.println("3 - Sair");

            op = scanner.nextInt();
            
                switch (op) {
                    case 1:
                        System.out.println("\nBiomas Brasileiros\n");
                        Amazonia amazonia = new Amazonia();
                        Caatinga caatinga = new Caatinga();
                        Cerrado cerrado = new Cerrado();
                        MataAtlantica mataAtlantica = new MataAtlantica();
                        Pampas pampas = new Pampas();
                        Pantanal pantanal = new Pantanal();

                        amazonia.apresentarNome();
                        amazonia.exibirClima();

                        caatinga.apresentarNome();
                        caatinga.exibirClima();

                        cerrado.apresentarNome();
                        cerrado.exibirClima();

                        mataAtlantica.apresentarNome();
                        mataAtlantica.exibirClima();

                        pampas.apresentarNome();
                        pampas.exibirClima();

                        pantanal.apresentarNome();
                        pantanal.exibirClima();
                    break;

                    case 2:
                        System.out.println(" ");
                    break;

                    case 3:
                        System.out.println("\nVocê Saiu do Programa");
                    break;

                    default:
                        System.out.println("Opção Inválida");
                    break;
                };

        } while (op != 3);

        scanner.close();
    };
};