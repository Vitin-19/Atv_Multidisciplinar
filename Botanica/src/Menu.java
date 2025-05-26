package src;

import java.util.ArrayList;
import java.util.Scanner;
import src.models.Angiosperma;
import src.models.Briofita;
import src.models.Gimnosperma;
import src.models.Planta;
import src.models.Pteridofita;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public boolean verificaTipo(String especie) {
        switch (especie) {
            case "briofita":
            case "pteridofita":
            case "gimnosperma":
            case "angiosperma":
                return true;
            default:
                return false;
        }
    }

    public boolean confirmarCadastro(String especie, String tipo, String nomeCientifico, String classe, String familia) {
        System.out.println("Os dados estão corretos ?");
        System.out.println("Espécie: " + especie);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nome científico: " + nomeCientifico);
        System.out.println("Classe: " + classe);
        System.out.println("Família: " + familia);
        System.out.print("S/N: ");
        String confirmacao = scan.nextLine().toLowerCase();
        switch (confirmacao) {
            case "s":
                return true;
            case "n":
                return false;
            default:
                return confirmarCadastro(especie, tipo, nomeCientifico, classe, familia);
        }
    }

    public void explicarPlantas() {
        Planta[] tipos = {new Briofita(), new Pteridofita(), new Gimnosperma(), new Angiosperma()};
        for (Planta tipo : tipos) {
            System.out.println();
            tipo.explicar_tipo();
        }
    }

    public ArrayList<Planta> cadastrarPlanta(ArrayList<Planta> plantas) {
        System.out.println("Digite a espécie da planta: ");
        String especie = scan.nextLine();
        System.out.println("Digite o tipo da planta ex(briofita,pteridofita,...) OBS: NÃO USE CARACTERES ESPECIAIS: ");
        String tipo = scan.nextLine().toLowerCase();
        if (!verificaTipo(tipo)) {
            while (true) {
                System.out.println("Digite um tipo válida ex(briofita,pteridofita,...) OBS: NÃO USE CARACTERES ESPECIAIS: ");
                tipo = scan.nextLine().toLowerCase();
                if (verificaTipo(tipo)) {
                    break;
                }
            }
        }
        System.out.println("Digite o nome científico da planta: ");
        String nomeCientifico = scan.nextLine();
        System.out.println("Digite a classe da planta: ");
        String classe = scan.nextLine();
        System.out.println("Digite a família da planta: ");
        String familia = scan.nextLine();
        System.out.println("");
        boolean confirmacao = confirmarCadastro(especie, tipo, nomeCientifico, classe, familia);
        if (!confirmacao) {
            System.out.println("Cadastramento cancelado");
            return plantas;
        }
        Planta newPlanta;
        switch (tipo) {
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

    public void visualizarPlanta(ArrayList<Planta> plantas) {
        if (plantas.isEmpty()) {
            System.out.println("Nenhuma planta cadastrada");
        } else {
            System.out.println("Qual planta deseja visualizar ?");
            for (Planta planta : plantas) {
                System.out.println(planta.get_especie());
            }
            String plantaSelecionada = scan.nextLine().toLowerCase();
            int index = -1;
            for (int i = 0; i < plantas.size(); i++) {
                if (plantaSelecionada.equals(plantas.get(i).get_especie().toLowerCase())) {
                    index = i;
                }
            }
            if (index == -1) {
                System.out.println("Planta não encontrada");
            } else {
                System.out.println("");
                plantas.get(index).mostrar_planta();
            }
        }
    }

    public ArrayList<Planta> editarPlanta(ArrayList<Planta> plantas) {
        if (plantas.isEmpty()) {
            System.out.println("Nenhuma planta cadastrada");
            return plantas;
        }
        System.out.println("Qual planta deseja editar ?\n");
        for (Planta planta : plantas) {
            System.out.println(planta.get_especie());
        }
        String plantaSelecionada = scan.nextLine().toLowerCase();
        int index = -1;
        for (int i = 0; i < plantas.size(); i++) {
            if (plantaSelecionada.equals(plantas.get(i).get_especie().toLowerCase())) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Planta não encontrada");
            return plantas;
        }
        System.out.println("\nO que deseja editar (ex: especie, classe,...) Digite cancelar para cancelar: ");
        plantas.get(index).mostrar_planta();
        String caracteristica = scan.nextLine().toLowerCase();
        switch (caracteristica) {
            case "especie":
                System.out.println("Digite a nova espécie: ");
                String novaEspecie = scan.nextLine();
                plantas.get(index).set_especie(novaEspecie);
                System.out.println("Planta editada com sucesso");
                break;
            case "nome cientifico":
                System.out.println("Digite o novo nome científico: ");
                String novaNome = scan.nextLine();
                plantas.get(index).set_nome_cientifico(novaNome);
                System.out.println("Planta editada com sucesso");
                break;
            case "classe":
                System.out.println("Digite a nova classe: ");
                String novaClasse = scan.nextLine();
                plantas.get(index).set_classe(novaClasse);
                System.out.println("Planta editada com sucesso");
                break;
            case "familia":
                System.out.println("Digite a nova família: ");
                String novaFamilia = scan.nextLine();
                plantas.get(index).set_familia(novaFamilia);
                System.out.println("Planta editada com sucesso");
                break;
            case "cancelar":
                System.out.println("Edição cancelada");
                return plantas;
            case "tipo":
                System.out.println("Digite o novo tipo: (OBS: NÃO USE CARACTERES ESPECIAIS)");
                String novoTipo = scan.nextLine().toLowerCase();
                if (!verificaTipo(novoTipo)) {
                    while (true) {
                        System.out.println("Digite um tipo válida ex(briofita,pteridofita,...) OBS: NÃO USE CARACTERES ESPECIAIS: ");
                        novoTipo = scan.nextLine().toLowerCase();
                        if (verificaTipo(novoTipo)) {
                            break;
                        }
                    }
                }
                Planta planta = plantas.get(index);
                System.out.println("");
                switch (novoTipo) {
                    case "briofita":
                        planta = new Briofita(planta.get_especie(), planta.get_nome_cientifico(), planta.get_classe(), planta.get_familia());
                        plantas.add(planta);
                        break;
                    case "pteridofita":
                        planta = new Pteridofita(planta.get_especie(), planta.get_nome_cientifico(), planta.get_classe(), planta.get_familia());
                        plantas.add(planta);
                        break;
                    case "gimnosperma":
                        planta = new Gimnosperma(planta.get_especie(), planta.get_nome_cientifico(), planta.get_classe(), planta.get_familia());
                        plantas.add(planta);
                        break;
                    case "angiosperma":
                        planta = new Angiosperma(planta.get_especie(), planta.get_nome_cientifico(), planta.get_classe(), planta.get_familia());
                        plantas.add(planta);
                        break;
                }
                plantas.remove(index);
                System.out.println("Planta editada com sucesso");
                break;
            default:
                System.out.println("Opção inváldia");
                editarPlanta(plantas);
        }
        return plantas;
    }

    public ArrayList<Planta> excluirPlanta(ArrayList<Planta> plantas) {
        if (plantas.isEmpty()) {
            System.out.println("Nenhuma planta cadastrada");
            return plantas;
        }
        System.out.println("\nQual planta deseja excluir ?\n");
        for (Planta planta : plantas) {
            System.out.println(planta.get_especie());
        }
        String plantaSelecionada = scan.nextLine().toLowerCase();
        int index = -1;
        for (int i = 0; i < plantas.size(); i++) {
            if (plantaSelecionada.equals(plantas.get(i).get_especie().toLowerCase())) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Planta não encontrada");
            return plantas;
        }
        System.out.printf("Tem certeza que deseja excluir %s S/N ?\n", plantas.get(index).get_especie());
        String confirmacao = scan.nextLine().toLowerCase();
        switch (confirmacao) {
            case "s":
                plantas.remove(index);
                return plantas;
            case "n":
                System.out.println("Operação cancelada");
                return plantas;
            default:
                System.out.println("Opção inválida");
                excluirPlanta(plantas);
        }
        return plantas;
    }

    public void menu() {
        ArrayList<Planta> plantas = new ArrayList<Planta>();
        do {
            System.out.println("***MENU***");
            System.out.println("1- Explicar tipos de plantas");
            System.out.println("2- Cadastrar planta");
            System.out.println("3- Visualizar planta");
            System.out.println("4- Editar planta");
            System.out.println("5- Excluir planta");
            System.out.println("6- Sair");
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
                    visualizarPlanta(plantas);
                    break;
                case 4:
                    plantas = editarPlanta(plantas);
                    break;
                case 5:
                    plantas = excluirPlanta(plantas);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            if (opMenu == 6) {
                break;
            }
        } while (true);
    }
}
