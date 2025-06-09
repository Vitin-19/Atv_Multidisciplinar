package Matematica;

import java.util.ArrayList;
import java.util.Scanner;

public class TeoremaPitagoras extends Trigono {

    public TeoremaPitagoras(String Definicao, String Pitagoras, double Hipotenusa, double CatAdjacente,
            double CatOposto, double TangenteF, double SenoF,
            double CossenoF) {
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);
        set_Pitagoras(Pitagoras);

    }

    // Metodos get
    public String get_Pitagoras() {
        return this.Pitagoras;
    }

    // Metodos set
    public void set_Pitagoras(String Pitagoras) {
        this.Pitagoras = Pitagoras;
    }

    private String Pitagoras;

    double Hipotenusa, CatAdjacente, CatOposto;

    // Sobreescrebve o método abstrato do Trigono
    @Override
    // Método para apresentar a definição da Trigonometria e do Teorema de Pitagoras
    public void apresentarDefinicao() {
        System.out.println("---- O QUE É A TRIGONOMETRIA? ----\n");

        System.out.println(
                "DEFINIÇÃO: Trigonometria é uma palavra de origem grega que remete à medida de três ângulos. Os estudos dessa área da Matemática voltam-se para os triângulos, que são polígonos que possuem três lados e, consequentemente, três ângulos. Em um primeiro momento, a trigonometria ocupa-se de estudar algumas propriedades e relações dos triângulos retângulos para posteriormente relacionar as medidas dos lados dos triângulos com as medidas dos ângulos.\n \nEssas propriedades e relações são expandidas para triângulos quaisquer por meio dos teoremas conhecidos como lei dos senos e lei dos cossenos. Posteriormente, alguns desses resultados são observados em triângulos cujos lados são segmentos notáveis de um círculo, que fica conhecido como círculo trigonométrico.\n \nA trigonometria propõe uma grande novidade. Antes dela só era possível considerar cálculos e propriedades que envolvessem exclusivamente lados ou exclusivamente ângulos de um triângulo ou relações básicas entre esses elementos. Com a sua chegada, é possível relacionar diretamente as medidas de lados de um triângulo com a medida de um de seus ângulos. Vale ressaltar que as relações entre os lados e segmentos notáveis dentro de um triângulo também compõem a trigonometria.\n \nEm resumo A trigonometria é a parte da matemática que estuda as relações existentes entre os lados e os ângulos dos triângulos. Ela é utilizada também em outras áreas de estudo como física, química, biologia, geografia, astronomia, medicina, engenharia, etc.\n");

        System.out.println("\n---- FUNÇÕES TRIGONOMÉTRICAS ----\n");

        System.out.println(
                "DEFINIÇÃO: As funções trigonométricas são as funções relacionadas aos triângulos retângulos, que possuem um ângulo de 90°. São elas: seno, cosseno e tangente. As funções trigonométricas estão baseadas nas razões existentes entre dois lados do triângulo em função de um ângulo. Ela são formadas por dois catetos (oposto e adjacente) e a hipotenusa:");
        System.out.println("\n-Seno é igual ao Cateto oposto sobre a Hipotenusa;");
        System.out.println("\n-Cosseno é igual ao Cateto adjacente sobre a Hipotenusa;");
        System.out.println("\n-Tangente é igual ao Cateto oposto sobre o Cateto adjacente;\n");

        System.out.println("---- TEOREMA DE PITAGORAS ----");

        System.out.println(
                "\nDEFINIÇÃO: O Teorema de Pitágoras, criado pelo filósofo e matemático grego, Pitágoras de Samos, (570 a.C. - 495 a.C.), é muito utilizado nos estudos trigonométricos. O Teorema de Pitágoras relaciona o comprimento dos lados do triângulo retângulo. Essa figura geométrica é formada por um ângulo interno de 90°, chamado de ângulo reto. É usado para determinar a medida desconhecida de um lado, uma vez conhecidas as medidas dos outros dois lados, O enunciado desse teorema é: \nA hipotenusa ao quadrado é igual a soma dos quadrados dos catetos. Em forma de equação, a fórmula do Teorema de Pitágoras é: a² = c² + b², sendo, a = Hipotenusa, c e b = catetos");
    }

    //Método para calcular um dos lados do Triangulo Retangulo usando o Teorema de Pitagoras
    public void formulaPitagoras(Scanner scanner) {
        // Variável de opção do usuário
        String nomeOp;

        // Loop doWhile para o menu do Teorema de Pitagoras
        do {

            System.out.println("\n=====================\n TEOREMA DE PITAGORAS \n=====================\n");
            System.out.println("Escolha uma opção:");
            System.out.println("- Encontrar Hipotenusa");
            System.out.println("- Encontrar Cateto Oposto");
            System.out.println("- Encontrar Cateto Adjacente");
            System.out.println("- Voltar ao Menu Principal\n");

            System.out.println("Digite a opção desejada sem acentos e/ou caracteres especiais");
            // Lê a opção que o usuário digitou e converte tudo para minusculo
            nomeOp = scanner.nextLine().toLowerCase();

            // Switch case para das opções escolhidas pelo usuário
            switch (nomeOp) {
                case "hipotenusa":
                    // variável para validar dados de entrada do usuário
                    boolean dadosValidos = false; 
                    do {
                        System.out.println("\n--- CALCULANDO A HIPOTENUSA ---\n");
                        System.out.println("Insira o valor do Cateto Oposto: ");
                        // Lê o valor do Cateto Oposto fornecida pelo usuário
                        CatOposto = scanner.nextDouble();
                        System.out.println("Insira o valor do Cateto Adjacente:");
                        // Lê o valor do Cateto Adjacente fornecida pelo usuário
                        CatAdjacente = scanner.nextDouble();
                        // Validacao de dados: os catetos precisam ser maiores que zero
                        if ((CatAdjacente > 0) && (CatOposto > 0)) {
                            Hipotenusa = Math.sqrt(Math.pow(CatOposto, 2) + Math.pow(CatAdjacente, 2));
                            System.out.println("O valor da Hipotenusa é: " + Hipotenusa);
                            // Consome a quebra de linha
                            scanner.nextLine();
                            System.out.println("Aperte ENTER para prosseguir");
                            // define a variável como verdadeira
                            dadosValidos = true; 
                        } else {
                            System.out.println("Dados invalidos!! Os valores dos Catetos precisam ser maior que zero");
                            // Consome a quebra de linha
                            scanner.nextLine();
                            System.out.println("Aperte ENTER para prosseguir");
                        }
                        // Repete quando os dados nao forem validos
                    } while (!dadosValidos); 

                    break;

                case "cateto oposto":
                    do {
                        // Definindo a variável como falsa
                        dadosValidos = false;
                        System.out.println("\n--- CALCULANDO O CATETO OPOSTO ---\n");
                        System.out.println("Insira o valor da Hipotenusa: ");
                        // Lê o valor da Hipotenusa fornecida pelo usuário
                        Hipotenusa = scanner.nextDouble();
                        System.out.println("Insira o valor do Cateto Adjacente:");
                        // Lê o valor da Cateto Adjacente fornecida pelo usuário
                        CatAdjacente = scanner.nextDouble();
                        //  Validacao de dados: o Cateto Adjacente e a Hipotenusa precisam ser maior que zero e a hipotenusa maior que o Cateto Adjacente
                        if ((Hipotenusa > 0) && (CatAdjacente > 0) && ((Hipotenusa - CatAdjacente) > 0)) {
                            CatOposto = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(CatAdjacente, 2));
                            System.out.println("O valor do Cateto oposto é: " + CatOposto);
                            // Consome a quebra de linha
                            scanner.nextLine();
                            System.out.println("Aperte ENTER para prosseguir");
                            // Define a variável como verdadeira
                            dadosValidos = true;
                        } else {
                            System.out.println(
                                    "Dados inválidos!! O valor da Hipotenusa precisa ser maior que o do Cateto");
                                    // Consome a quebra de linha
                            scanner.nextLine();
                            System.out.println("Aperte ENTER para prosseguir");
                        }
                        // Repete quando os dados não forem válidos
                    } while (!dadosValidos); 

                    break;

                case "cateto adjacente":
                    do {
                        // Define a variável como falsa
                        dadosValidos = false;
                        System.out.println("\n--- CALCULANDO O CATETO ADJACENTE ---\n");
                        System.out.println("Insira o valor do Hipotenusa:");
                        // Lê o valor da Hipotenusa fornecida pelo usuário
                        Hipotenusa = scanner.nextInt();
                        System.out.println("Insira o valor da Cateto Oposto:");
                        // Lê o valor do Cateto Oposto fornecida pelo usuário
                        CatOposto = scanner.nextInt();
                        // Validacao de dados: o Cateto Oposto e a Hipotenusa precisam ser maior que zero e a hipotenusa maior que o Cateto Oposto
                        if ((Hipotenusa > 0) && (CatOposto > 0) && ((Hipotenusa - CatOposto) > 0)) {
                            CatAdjacente = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(CatOposto, 2));
                            System.out.println("O valor do Cateto Adjacente é: " + CatAdjacente);
                            // Consome a quebra de linha
                            scanner.nextLine();
                            System.out.println("Aperte ENTER para prosseguir");
                            // Define a variável como verdadeira
                            dadosValidos = true;
                        } else {
                            System.out.println(
                                    "Dados inválidos!! O valor da Hipotenusa precisa ser maior que o do Cateto");
                                    // Consome a quebra de linha
                            scanner.nextLine();
                            System.out.println("Aperte ENTER para prosseguir");
                        }
                        // Repete quando os dados não forem válidos
                    } while (!dadosValidos); 

                    break;
                    // Case para voltar ao menu principal
                case "menu principal":
                    System.out.println("Voltando....");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            } 
            // Repete até o usuário digitar a opção "menu principal"
        } while (!nomeOp.equals("menu principal"));
    }

    // Sobrescreve o método abstrato do Trigono
    @Override
    // Método para exibir a formula do Teorema de Pitagoras
    public void exibirFormula() {
        System.out.println("A formula base do Teorema de Pitagoras é: a² = b² + c².");
    }
}















// TENTAR ADICIONAR DEPOIS

// TELINHA DE VOLTAR COM TEMPO

// String telaVoltar = "Voltando....";
// for (int i = 0; i < telaVoltar.length(); i++) {
// i = 8;
// System.out.print(telaVoltar.charAt(i));
// try {
// Thread.sleep(2000);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
