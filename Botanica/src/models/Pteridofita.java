package Botanica.src.models;

public class Pteridofita extends Planta{
    public Pteridofita(String especie, String nome_cientifico, String classe, String familia){
        super(especie, nome_cientifico, classe, familia);
        set_tipo("Pteridófita");
    }
    public Pteridofita(){
        super(null,null,null,null);
    }

    @Override
    public void explicar_tipo(){
        System.out.println("\nPteridófitas\n");
        
        System.out.println("Pteridófitas são plantas vasculares, ou seja, que apresentam vasos condutores de seiva.\nEssas plantas não possuem flores, sementes ou frutos e sua reprodução é dependente de água, uma vez que\napresentam anterozoides flagelados que precisam nadar até a oosfera para que a fecundação ocorra. Um exemplo de\npteridófita é a samambaia.");
    }
}