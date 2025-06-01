package Matematica;

// CÓDIGO FEITO POR PEDRO ISAÍAS GOMES DE JESUS - 2°DS MTEC
// GRUPO: VITOR PAIVA NUNES DE PAULA - PYETRO FABRÍCIO PETERLINI

import java.util.Scanner;

public class MainTrigono {

    public static void apresentarTeoria() {
        Trigono[] Definicoes = {
                new TeoremaPitagoras(null, null, 0, 0, 0, 0, 0, 0),
                new Cosseno(null, 0, 0, 0, 0, 0, 0),
                new Seno(null, 0, 0, 0, 0, 0, 0),
                new Tangente(null, 0, 0, 0, 0, 0, 0)
        };
        for (Trigono apresentarDefinicao : Definicoes) {
            System.out.println();
            apresentarDefinicao.apresentarDefinicao();
        }
    }

    public static void exibirFormulas() {
        Trigono[] formulas = {
                new Cosseno(null, 0, 0, 0, 0, 0, 0),
                new Seno(null, 0, 0, 0, 0, 0, 0),
                new Tangente(null, 0, 0, 0, 0, 0, 0),
                new TeoremaPitagoras(null, null, 0, 0, 0, 0, 0, 0)
        };
        for (Trigono exibirFormula : formulas) {
            System.out.println();
            exibirFormula.exibirFormula();
        }
    }

    public static void formulaPitagoras(Scanner scanner) {
        TeoremaPitagoras[] Pitagoras = {
                new TeoremaPitagoras(null, null, 0, 0, 0, 0, 0, 0)
        };
        for (TeoremaPitagoras formulaPitagoras : Pitagoras) {
            System.out.println();
            formulaPitagoras.formulaPitagoras(scanner);
        }
    }

    public static void mainTrigono() {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {

            System.out.println("---- TRIGONOMETRIA ----");
            System.out.println("1 - Apresentar teoria");
            System.out.println("2 - Exibir Fórmulas");
            System.out.println("3 - Teorema de Pitagoras");
            System.out.println("4 - Sair");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    apresentarTeoria();
                    break;

                case 2:
                    exibirFormulas();
                    break;

                case 3:
                    formulaPitagoras(scanner);
                    break;

                case 4:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (op != 4);
    }
}