// CÓDIGO FEITO POR PYETRO FABRÍCIO PETERLINI - 2°DS MTEC
// GRUPO: PEDRO ISAÍAS GOMES DE JESUS - PYETRO FABRÍCIO PETERLINI - VITOR PAIVA NUNES DE PAULA
package DS_GEOGRAFIA_BIOMAS.src;

// Importações
import DS_GEOGRAFIA_BIOMAS.src.models.Amazonia;
import DS_GEOGRAFIA_BIOMAS.src.models.Bioma;
import DS_GEOGRAFIA_BIOMAS.src.models.Caatinga;
import DS_GEOGRAFIA_BIOMAS.src.models.Cerrado;
import DS_GEOGRAFIA_BIOMAS.src.models.MataAtlantica;
import DS_GEOGRAFIA_BIOMAS.src.models.Pampas;
import DS_GEOGRAFIA_BIOMAS.src.models.Pantanal;
import java.util.Scanner;

public class MainBiomas {
    public static void mainBiomas() {
        Scanner scanner = new Scanner(System.in); // objeto para leitura de entrada

        int op; // variavel para as opções
        String nomeBioma; // variavel string para armazenar opção da segunda escolha

        // inicio do do/while da opção principal
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir os biomas do Brasil");
            System.out.println("2 - Escolha um bioma para uma visão mais detalhada");
            System.out.println("3 - Sair");

            op = scanner.nextInt(); // "capturar" a ecolha do usuário
            scanner.nextLine(); // consome a quebra de linha

            switch (op) {
                case 1:
                    System.out.println("\nBiomas Brasileiros");

                    // array com as classes biomas e um for para apresentar os nomes e o clima de todos os biomas
                    Bioma[] biomas = { new Amazonia(), new Caatinga(), new Cerrado(), new MataAtlantica(), new Pampas(), new Pantanal() };
                    for (Bioma bioma : biomas) {
                        System.out.println();
                        bioma.apresentarNome();
                        bioma.exibirClima();
                    };
                break;

                case 2:
                    // segudno do/while para a opção 2
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
                            nomeBioma = scanner.nextLine().toLowerCase(); // leitura de dados e o "toLowerCase()" para o usuário (BIOS) digitar de qualquer jeito

                            switch (nomeBioma) {
                                case "amazonia": // apresenta os detalhes da classe Amazonia()
                                    Amazonia amazonia = new Amazonia();
                                    amazonia.exibirDetalhes();
                                break;

                                case "caatinga": // apresenta os detalhes da classe Caatinga()
                                    Caatinga caatinga = new Caatinga();
                                    caatinga.exibirDetalhes();
                                break;

                                case "cerrado": // apresenta os detalhes da classe Cerrado()
                                    Cerrado cerrado = new Cerrado();
                                    cerrado.exibirDetalhes();
                                break;

                                case "mataatlantica": // apresenta os detalhes da classe MataAtlantica()
                                case "mata atlantica": // também funciona, serve para caso o usuário digite com espaço entre mata e atlantica
                                    MataAtlantica mataAtlantica = new MataAtlantica();
                                    mataAtlantica.exibirDetalhes();
                                break;

                                case "pampas": // apresenta os detalhes da classe Pampas()
                                    Pampas pampas = new Pampas();
                                    pampas.exibirDetalhes();
                                break;

                                case "pantanal": // apresenta os detalhes da classe Pantanal()
                                    Pantanal pantanal = new Pantanal();
                                    pantanal.exibirDetalhes();
                                break;

                                case "sair": // sai do programa
                                    System.out.println("\nVocê saiu da opção 2");
                                break;

                                default: // caso o usuário digite errado ou digite qualquer outra coisa
                                    System.out.println("Opção Inválida");
                                break;
                            };
                    } while (!nomeBioma.equals("sair")); // fim do do/while da opção 2, volta pra primeira tela
                break;

                case 3: // sai do programa
                    System.out.println("\nVocê saiu do Programa");
                break;

                default: // caso o usuário digite errado ou qualquer outra coisa
                    System.out.println("Opção Inválida");
                break;
            };

        } while (op != 3); // fim do do/while da primeira tela
    };
};