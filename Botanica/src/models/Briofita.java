package models;

public class Briofita extends Planta{
    public Briofita(String especie, String nome_cientifico, String classe, String familia){
        super(especie, nome_cientifico, classe, familia);
        set_tipo("Briofita");
    }

    @Override
    public void explicar_tipo(){
        System.out.println("As briófitas são um grupo de plantas avasculares, ou seja, não possuem tecidos condutores\n de água e nutrientes, caracterizando-se por seu pequeno porte e vida em ambientes úmidos e sombreados.\nGeralmente as briófitas são plantas rasteiras como o musgo.");
    }
}
