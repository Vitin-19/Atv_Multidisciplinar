package Botanica.src.models;

public class Gimnosperma extends Planta {
    public Gimnosperma(String especie, String nome_cientifico, String classe, String familia){
        super(especie, nome_cientifico, classe, familia);
        set_tipo("Gimnosperma");
    }
    public Gimnosperma(){
        super(null,null,null,null);
    }

    @Override
    public void explicar_tipo(){
        System.out.println("\nGimnospermas\n");

        System.out.println("As gimnospermas caracterizam-se por sua independência de água para a reprodução e por\nproduzirem sementes nuas. As gimnospermas são plantas vasculares, normalmente árvores, conhecidas\nprincipalmente\npor uma importante novidade evolutiva: as sementes.\nO Pinheiro é um exemplo de gimnosperma.");
    }
}
