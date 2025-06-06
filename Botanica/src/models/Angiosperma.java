package Botanica.src.models;

public class Angiosperma extends Planta{
    public Angiosperma(String especie, String nome_cientifico, String classe, String familia){
        super(especie, nome_cientifico, classe, familia);
        set_tipo("Angiosperma");
    }
    public Angiosperma(){
        super(null,null,null,null);
    }

    @Override
    public void explicar_tipo(){
        System.out.println("\nAngiospermas\n");
        
        System.out.println("As angiospermas, também conhecidas como plantas com flores e frutos, são um grupo vasto e\ndiversificado de plantas vasculares que inclui a maioria das espécies vegetais que encontramos no planeta.\nExemplos incluem árvores frutíferas como a laranjeira, a goiabeira e a macieira.");
    }
}
