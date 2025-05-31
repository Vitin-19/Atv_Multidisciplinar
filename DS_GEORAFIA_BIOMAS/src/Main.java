// CÓDIGO FEITO POR PYETRO FABRÍCIO PETERLINI - 2°DS MTEC
// GRUPO: PEDRO ISAÍAS GOMES DE JESUS - VITOR PAIVA NUNES DE PAULA
package src;

import java.util.Scanner;
import src.models.Amazonia;
import src.models.Bioma;
import src.models.Caatinga;
import src.models.Cerrado;
import src.models.MataAtlantica;
import src.models.Pampas;
import src.models.Pantanal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op;
        String nomeBioma;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir os biomas do Brasil");
            System.out.println("2 - Escolha um bioma para uma visão mais detalhada");
            System.out.println("3 - Sair");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\nBiomas Brasileiros");

                    Bioma[] biomas = { new Amazonia(), new Caatinga(), new Cerrado(), new MataAtlantica(), new Pampas(), new Pantanal() };
                    for (Bioma bioma : biomas) {
                        System.out.println();
                        bioma.apresentarNome();
                        bioma.exibirClima();
                    };
                break;

                case 2:
                    do {
                        System.out.println("\nEscolha um Bioma:");
                        System.out.println("- Amazonia");
                        System.out.println("- Caatinga");
                        System.out.println("- Cerrado");
                        System.out.println("- Mata Atlantica");
                        System.out.println("- Pampas");
                        System.out.println("- Pantanal");
                        System.out.println("- Sair");

                        System.out.print("\nDigite o nome do bioma escolhido (sem acentos e/ou caracteres especiais): \n");
                            nomeBioma = scanner.nextLine().toLowerCase();

                            switch (nomeBioma) {
                                case "amazonia":
                                    Amazonia amazonia = new Amazonia();
                                    amazonia.exibirDetalhes();
                                break;

                                case "caatinga":
                                    Caatinga caatinga = new Caatinga();
                                    caatinga.exibirDetalhes();
                                break;

                                case "cerrado":
                                    Cerrado cerrado = new Cerrado();
                                    cerrado.exibirDetalhes();
                                break;

                                case "mata atlantica":
                                    MataAtlantica mataAtlantica = new MataAtlantica();
                                    mataAtlantica.exibirDetalhes();
                                break;

                                case "pampas":
                                    Pampas pampas = new Pampas();
                                    pampas.exibirDetalhes();
                                break;

                                case "pantanal":
                                    Pantanal pantanal = new Pantanal();
                                    pantanal.exibirDetalhes();
                                break;

                                case "sair":
                                    System.out.println("\nVocê saiu da opção 2");
                                break;

                                default:
                                    System.out.println("Opção Inválida");
                                break;
                            };
                    } while (!nomeBioma.equals("sair"));
                break;

                case 3:
                    System.out.println("\nVocê saiu do Programa");
                break;

                default:
                    System.out.println("Opção Inválida");
                break;
            };

        } while (op != 3);

        scanner.close();
    };
};