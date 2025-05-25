package models;

public class Pteridofita extends Planta{
    public Pteridofita(String especie, String nome_cientifico, String classe, String familia){
        super(especie, nome_cientifico, classe, familia);
        set_tipo("Pteridófita");
    }

    @Override
    public void explicar_tipo(){
        System.out.println("Pteridófitas são plantas vasculares, ou seja, que apresentam vasos condutores de seiva.\n Essas plantas não possuem flores, sementes ou frutos e sua reprodução é dependente de água, uma vez que\n apresentam anterozoides flagelados que precisam nadar até a oosfera para que a fecundação ocorra.Um exemplo de\n pteridófita é a samambaia.");
    }
}