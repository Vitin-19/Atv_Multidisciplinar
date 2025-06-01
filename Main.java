
import Botanica.src.MainBotanica;
import Botanica.src.models.Planta;
import DS_GEOGRAFIA_BIOMAS.src.MainBiomas;
import Matematica.MainTrigono;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MainBotanica botanica = new MainBotanica();
        MainBiomas biomas = new MainBiomas();
        MainTrigono trigonometria = new MainTrigono();
        ArrayList<Planta> plantas = new ArrayList<Planta>();
        do { 
            System.out.println("__MENU__");
            System.out.println("1- Biologia/Botânica");
            System.out.println("2- Geografia/Biomas");
            System.out.println("3- Matemática/Trigonometria");
            System.out.println("4- Sair");
            int opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    plantas = botanica.mainBotanica(plantas);
                break;
                case 2:
                    biomas.mainBiomas();
                break;
                case 3:
                    trigonometria.mainTrigono();
                break;
                case 4:
                    System.out.println("Saindo...");
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
            if(opcao == 4){
                break;
            }

        } while (true);

    }
}
