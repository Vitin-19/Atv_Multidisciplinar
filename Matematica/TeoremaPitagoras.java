import java.util.ArrayList;
import java.util.Scanner;

public class TeoremaPitagoras {

    @Override

    int op;
    Scanner scanner = new Scanner(System.in);
    double Hipotenusa, CatAdjacente, CatOposto;

    do
    {

        System.out.println("---- Teorema de Pitagoras ----");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Encontrar Hipotenusa");
        System.out.println("2 - Encontrar Cateto Oposto");
        System.out.println("3 - Encontrar Cateto Adjacente");
        System.out.println("4 - Sair");

        op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("--- Calculando a Hipotenusa ---");
                System.out.println("Insira o valor do cateto oposto: ");
                CatOposto = scanner.nextDouble();
                System.out.println("Insira o valor do cateto adjacente:");
                CatAdjacente = scanner.nextDouble();
                if ((CatAdjacente > 0) && (CatOposto > 0)) {
                    Hipotenusa = Math.sqrt(Math.pow(CatOposto, 2) + Math.pow(CatAdjacente, 2));
                    System.out.println("O valor da hipotenusa é: " + Hipotenusa);
                } else {
                    System.out.println("Dados invalidos!!");
                }
                break;

            case 2:
                System.out.println("--- Calculando o Cateto Oposto ---");
                System.out.println("Insira o valor do cateto adjacente: ");
                CatAdjacente = scanner.nextDouble();
                System.out.println("Insira o valor da hipotenusa:");
                Hipotenusa = scanner.nextDouble();
                if ((Hipotenusa > 0) && (CatAdjacente > 0) && ((Hipotenusa - CatAdjacente) > 0)) {
                    CatOposto = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(CatAdjacente, 2));
                    System.out.println("O valor do cateto oposto é: " + CatOposto);
                } else {
                    System.out.println("Dados inválidos!!");
                }
                break;

            case 3:
                System.out.println("--- Calculando o Cateto Adjacente ---");
                System.out.println("Insira o valor do cateto oposto:");
                CatOposto = scanner.nextDouble();
                System.out.println("Insira o valor da hipotenusa:");
                Hipotenusa = scanner.nextDouble();
                if ((Hipotenusa > 0) && (CatOposto > 0) && ((Hipotenusa - CatOposto) > 0)) {
                    CatAdjacente = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(CatOposto, 2));
                    System.out.println("O valor do cateto adjacente é: " + CatAdjacente);
                } else {
                    System.out.println("Dados inválidos!!");
                }
                break;

            default:
                System.out.println("Saindo....");
                break;
        }
    }while(op!=4);
}