package Matematica;

// CÓDIGO FEITO POR PEDRO ISAÍAS GOMES DE JESUS - 2°DS MTEC
// GRUPO: VITOR PAIVA NUNES DE PAULA - PYETRO FABRÍCIO PETERLINI - PEDRO ISAÍAS GOMES DE JESUS

// IMPORTATIONS
import java.util.Scanner;

public class MainTrigono {

    // Método para apresentar as definições
    public static void apresentarTeoria() {
        // Array de objetos Trigono para as definições
        Trigono[] Definicoes = {
            new TeoremaPitagoras(null, null, 0, 0, 0, 0, 0, 0),
            new Cosseno(null, 0, 0, 0, 0, 0, 0),
            new Seno(null, 0, 0, 0, 0, 0, 0),
            new Tangente(null, 0, 0, 0, 0, 0, 0)
        };
        // Percorre o Array para chamar o método de apresentarDefinicao de cada objeto
        for (Trigono apresentarDefinicao : Definicoes) {
            System.out.println();
            apresentarDefinicao.apresentarDefinicao();
        }
    }
    // Método para exibir as formulas e realizar os calculos
    public static void exibirFormulas() {
        // Array de objetos Trigono para as formulas
        Trigono[] formulas = {
            new Cosseno(null, 0, 0, 0, 0, 0, 0),
            new Seno(null, 0, 0, 0, 0, 0, 0),
            new Tangente(null, 0, 0, 0, 0, 0, 0),
            new TeoremaPitagoras(null, null, 0, 0, 0, 0, 0, 0)
        };
        // Percorre o Array para chamar o método exibirFormulas de cada objeto
        for (Trigono exibirFormula : formulas) {
            System.out.println();
            exibirFormula.exibirFormula();
        }
    }
    // Método para os calculos do Teorema de Pitagoras
    public static void formulaPitagoras(Scanner scanner) {
        // Cria um Array de Teorema de Pitagoras
        TeoremaPitagoras[] Pitagoras = {
            new TeoremaPitagoras(null, null, 0, 0, 0, 0, 0, 0)
        };
        // Percorre o Array para chamar o método formulaPitagoras
        for (TeoremaPitagoras formulaPitagoras : Pitagoras) {
            System.out.println();
            formulaPitagoras.formulaPitagoras(scanner);
        }
    }
    // Método Principal
    public static void mainTrigono() {
        Scanner scanner = new Scanner(System.in); // Instância do Scanner
        int op; // Variável para opcao escolhida pelo usuario

        // Loop doWhile para exibir o Menu 
        do {

            System.out.println("\n===============\n TRIGONOMETRIA \n===============\n");
            System.out.println("1 - Apresentar teoria");
            System.out.println("2 - Exibir Fórmulas");
            System.out.println("3 - Teorema de Pitagoras");
            System.out.println("4 - Sair");

            op = scanner.nextInt(); // Lê a opção escolhida pelo usuário
            scanner.nextLine(); // Consome a quebra de linha

            // Switch case para as opções escolhidas pelo usuário
            switch (op) {
                case 1:
                    apresentarTeoria();  // Chama o método de apresentar a teoria
                    break;

                case 2:
                    exibirFormulas();  // Chama o método de exibir as formulas
                    break;

                case 3:
                    formulaPitagoras(scanner);  // Chama o método para o Teorema de Pitagoras
                    break;

                case 4:
                    System.out.println("\nSaindo....");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (op != 4);  // O loop continua até a opção 4 ser selecionada
    }
}