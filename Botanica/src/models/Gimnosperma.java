package models;

public class Gimnosperma extends Planta {
    public Gimnosperma(String especie, String nome_cientifico, String classe, String familia){
        super(especie, nome_cientifico, classe, familia);
        set_tipo("Gimnosperma");
    }

    @Override
    public void explicar_tipo(){
        System.out.println("As gimnospermas caracterizam-se por sua independência de água para a reprodução e por\n produzirem sementes nuas. As gimnospermas são plantas vasculares, normalmente árvores, conhecidas principalmente\n por uma importante novidade evolutiva: as sementes.\n O Pinheiro é um exemplo de gimnosperma.");
    }
}
