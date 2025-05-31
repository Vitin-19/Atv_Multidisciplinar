import java.util.ArrayList;
import java.util.Scanner;

public class TeoremaPitagoras extends Trigono {

    public TeoremaPitagoras(String Definicao, String Pitagoras, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF,
            double CossenoF) {
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);
        set_Pitagoras(Pitagoras);
        
    }

    //Metodos get
    public String get_Pitagoras () {
        return this.Pitagoras;
    }

    //Metodos set
    public void set_Pitagoras (String Pitagoras) {
        this.Pitagoras = Pitagoras;
    }

    private String Pitagoras;
    
    // Scanner scanner = new Scanner(System.in);
    double Hipotenusa, CatAdjacente, CatOposto;

    @Override
    public void apresentarDefinicao() {
        System.out.println("---- O QUE É A TRIGONOMETRIA? ----");
        
        System.out.println("Definição: Trigonometria é uma palavra de origem grega que remete à medida de três ângulos. Os estudos dessa área da Matemática voltam-se para os triângulos, que são polígonos que possuem três lados e, consequentemente, três ângulos. Em um primeiro momento, a trigonometria ocupa-se de estudar algumas propriedades e relações dos triângulos retângulos para posteriormente relacionar as medidas dos lados dos triângulos com as medidas dos ângulos. \nDefinição: Essas propriedades e relações são expandidas para triângulos quaisquer por meio dos teoremas conhecidos como lei dos senos e lei dos cossenos. Posteriormente, alguns desses resultados são observados em triângulos cujos lados são segmentos notáveis de um círculo, que fica conhecido como “círculo trigonométrico”. \nDefinição: A trigonometria propõe uma grande novidade. Antes dela só era possível considerar cálculos e propriedades que envolvessem exclusivamente lados ou exclusivamente ângulos de um triângulo ou relações básicas entre esses elementos. Com a sua chegada, é possível relacionar diretamente as medidas de lados de um triângulo com a medida de um de seus ângulos. Vale ressaltar que as relações entre os lados e segmentos notáveis dentro de um triângulo também compõem a trigonometria. \nDefinição Em resumo A trigonometria é a parte da matemática que estuda as relações existentes entre os lados e os ângulos dos triângulos. Ela é utilizada também em outras áreas de estudo como física, química, biologia, geografia, astronomia, medicina, engenharia, etc.\n");

        System.out.println("\n---- FUNÇÕES TRIGONOMÉTRICAS ----");

        System.out.println("Definição: As funções trigonométricas são as funções relacionadas aos triângulos retângulos, que possuem um ângulo de 90°. São elas: seno, cosseno e tangente. As funções trigonométricas estão baseadas nas razões existentes entre dois lados do triângulo em função de um ângulo. Ela são formadas por dois catetos (oposto e adjacente) e a hipotenusa:");
        System.out.println("\nSeno é igual ao Cateto oposto sobre a Hipotenusa;");
        System.out.println("\nCosseno é igual ao Cateto adjacente sobre a Hipotenusa;");
        System.out.println("\nTAngente é igual ao Cateto oposto sobre o Cateto adjacente;\n");

        System.out.println("---- TEOREMA DE PITAGORAS ----");
        
        System.out.println("\nDefinição: O Teorema de Pitágoras, criado pelo filósofo e matemático grego, Pitágoras de Samos, (570 a.C. - 495 a.C.), é muito utilizado nos estudos trigonométricos. O Teorema de Pitágoras relaciona o comprimento dos lados do triângulo retângulo. Essa figura geométrica é formada por um ângulo interno de 90°, chamado de ângulo reto. É usado para determinar a medida desconhecida de um lado, uma vez conhecidas as medidas dos outros dois lados, O enunciado desse teorema é: \nA hipotenusa ao quadrado é igual a soma dos quadrados dos catetos. Em forma de equação, a fórmula do Teorema de Pitágoras é: a² = c² + b², sendo, a = Hipotenusa, c e b = catetos");
    }

    public void formulaPitagoras(Scanner scanner) {
        int op;
        
        do {

            System.out.println("\n---- TEOREMA DE PITAGORAS ----\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Encontrar Hipotenusa");
            System.out.println("2 - Encontrar Cateto Oposto");
            System.out.println("3 - Encontrar Cateto Adjacente");
            System.out.println("4 - Voltar ao Menu Principal");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n--- CALCULANDO A HIPOTENUSA ---\n");
                    System.out.println("Insira o valor do Cateto Oposto: ");
                    CatOposto = scanner.nextDouble();
                    System.out.println("Insira o valor do Cateto Adjacente:");
                    CatAdjacente = scanner.nextDouble();
                    if ((CatAdjacente > 0) && (CatOposto > 0)) {
                        Hipotenusa = Math.sqrt(Math.pow(CatOposto, 2) + Math.pow(CatAdjacente, 2));
                        System.out.println("O valor da Hipotenusa é: " + Hipotenusa);
                    } else {
                        System.out.println("Dados invalidos!! Os valores dos Catetos precisam ser maior que zero");
                    }
                    break;

                case 2:
                    System.out.println("\n--- CALCULANDO O CATETO OPOSTO ---\n");
                    System.out.println("Insira o valor da Hipotenusa: ");
                    Hipotenusa = scanner.nextDouble();
                    System.out.println("Insira o valor do Cateto Adjacente:");
                    CatAdjacente = scanner.nextDouble();
                    if ((Hipotenusa > 0) && (CatAdjacente > 0) && ((Hipotenusa - CatAdjacente) > 0)) {
                        CatOposto = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(CatAdjacente, 2));
                        System.out.println("O valor do Cateto oposto é: " + CatOposto);
                    } else {
                        System.out.println("Dados inválidos!! O valor da Hipotenusa precisa ser maior que o do Cateto");
                    }
                    break;

                case 3:
                    System.out.println("\n--- CALCULANDO O CATETO ADJACENTE ---\n");
                    System.out.println("Insira o valor do Hipotenusa:");
                    Hipotenusa = scanner.nextInt();
                    System.out.println("Insira o valor da Cateto Oposto:");
                    CatOposto = scanner.nextInt();
                    if ((Hipotenusa > 0) && (CatOposto > 0) && ((Hipotenusa - CatOposto) > 0)) {
                        CatAdjacente = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(CatOposto, 2));
                        System.out.println("O valor do Cateto Adjacente é: " + CatAdjacente);
                    } else {
                        System.out.println("Dados inválidos!! O valor da Hipotenusa precisa ser maior que o do Cateto");
                    }
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

    @Override
    public void exibirFormula() {
        System.out.println("A formula base do Teorema de Pitagoras é: a² = b² + c².");
    }
}