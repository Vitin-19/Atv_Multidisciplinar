import java.util.ArrayList;
import java.util.Scanner;

import models.Angiosperma;
import models.Briofita;
import models.Gimnosperma;
import models.Planta;
import models.Pteridofita;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public boolean verificaTipo(String especie){
        switch(especie){
            case "briofita":
            case "pteridofita":
            case "gimnosperma":
            case "angiosperma":
                return true;
            default:
                return false;
        }
    }
    public boolean confirmarCadastro(String especie, String tipo, String nomeCientifico, String classe, String familia){
        System.out.println("Os dados estão corretos ?");
        System.out.println("Espécie: " + especie);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nome científico: " + nomeCientifico);
        System.out.println("Classe: " + classe);
        System.out.println("Família: " + familia);
        System.out.print("S/N: ");
        String confirmacao = scan.nextLine().toLowerCase();
        switch (confirmacao){
            case "s": return true;
            case "n": return false;
            default: return confirmarCadastro(especie, tipo, nomeCientifico, classe, familia);
        }
    }

    public void explicarPlantas(){
        Planta[] tipos = {new Briofita(), new Pteridofita(), new Gimnosperma(), new Angiosperma()};
        for(Planta tipo : tipos){
            System.out.println();
            tipo.explicar_tipo();
        }
    }

    public ArrayList<Planta> cadastrarPlanta(ArrayList<Planta> plantas){
        System.out.println("Digite a espécie da planta: ");
        String especie = scan.nextLine();
        System.out.println("Digite o tipo da planta ex(briofita,pteridofita,...): ");
        String tipo = scan.nextLine().toLowerCase();
        if(!verificaTipo(tipo)){
            while(true){
                System.out.println("Digite um tipo válida ex(briofita,pteridofita,...): ");
                tipo = scan.nextLine().toLowerCase();
                if (verificaTipo(tipo)) break;
            }
        }
        System.out.println("Digite o nome científico da planta: ");
        String nomeCientifico = scan.nextLine();
        System.out.println("Digite a classe da planta: ");
        String classe = scan.nextLine();
        System.out.println("Digite a família da planta: ");
        String familia = scan.nextLine();
        boolean confirmacao = confirmarCadastro(especie, tipo, nomeCientifico, classe, familia);
        if(!confirmacao){
            System.out.println("Cadastramento cancelado");
            return plantas;
        }
        Planta newPlanta;
        switch(tipo){
            case "briofita":
                newPlanta = new Briofita(especie, nomeCientifico, classe, familia);
                plantas.add(newPlanta);
            break;
            case "pteridofita":
                newPlanta = new Pteridofita(especie, nomeCientifico, classe, familia);
                plantas.add(newPlanta);
            break;
            case "gimnosperma":
                newPlanta = new Gimnosperma(especie, nomeCientifico, classe, familia);
                plantas.add(newPlanta);
            break;
            case "angiosperma":
                newPlanta = new Angiosperma(especie, nomeCientifico, classe, familia);
                plantas.add(newPlanta);
            break;
        }
        System.out.println("Planta cadastrada com sucesso");
        return plantas;
    }
    public ArrayList<Planta> editarPlanta(ArrayList<Planta> plantas){
        System.out.println("Qual planta deseja editar ?");
        for(Planta planta : plantas){
            System.out.println(planta.get_especie());
        }
        String plantaSelecionada = scan.nextLine().toLowerCase();
        int index = -1;
        for(int i = 0; i < plantas.size(); i++){
            if(plantaSelecionada.equals(plantas.get(i).get_especie().toLowerCase())){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("Planta não encontrada");
            return plantas;
        }
        System.out.println("O que deseja editar (ex: espécie, classe,...): ");
        plantas.get(index).mostrar_planta();
        String caracteristica = scan.nextLine().toLowerCase();
        switch(caracteristica){
            case "espécie":
                System.out.println("Digite a nova espécie: ");
                String novaEspecie = scan.nextLine();
                plantas.get(index).set_especie(novaEspecie);
            break;
            case "nome científico":
                System.out.println("Digite o novo nome científico: ");
                String novaNome = scan.nextLine();
                plantas.get(index).set_especie(novaNome);
            break;
            case "classe":
                System.out.println("Digite a nova classe: ");
                String novaClasse = scan.nextLine();
                plantas.get(index).set_especie(novaClasse);
            break;
            case "família":
                System.out.println("Digite a nova família: ");
                String novaFamilia = scan.nextLine();
                plantas.get(index).set_especie(novaFamilia);
            break;
            case "tipo":
                System.out.println("Digite o novo tipo: ");
                String novoTipo = scan.nextLine().toLowerCase();
                if(!verificaTipo(novoTipo)){
                    while(true){
                        System.out.println("Digite um tipo válida ex(briofita,pteridofita,...): ");
                        novoTipo = scan.nextLine().toLowerCase();
                        if (verificaTipo(novoTipo)) break;
                    }
                }
                Planta planta = plantas.get(index);
                plantas.remove(index);
                plantas.add(planta);

        }
        return plantas;
    }

    public void menu(ArrayList<Planta> plantas) {
        System.out.println("***MENU***");
        System.out.println("1- Explicar tipos de plantas");
        System.out.println("2- Cadastrar planta");
        System.out.println("3- Editar planta");
        System.out.println("4- Excluir planta");
        System.out.println("5- Sair");
        int opMenu = scan.nextInt();
        scan.nextLine();
        switch (opMenu) {
            case 1:
                explicarPlantas();
                break;
            case 2:
                plantas = cadastrarPlanta(plantas);
                break;
            case 3:
                plantas = editarPlanta(plantas);
                break;
            case 4:
                excluirPlanta(plantas);
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
