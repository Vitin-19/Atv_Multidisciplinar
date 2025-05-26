package src.models;

public abstract class Planta {
    private String especie;
    private String tipo;
    private String nome_cientifico;
    private String classe;
    private String familia; 

    public Planta(String especie, String nome_cientifico, String classe, String familia){
        set_especie(especie);
        set_nome_cientifico(nome_cientifico);
        set_classe(classe);
        set_familia(familia);
    };

    // métodos get
    public String get_especie(){
        return this.especie;
    }
    public String get_nome_cientifico(){
        return this.nome_cientifico;
    }
    public String get_classe(){
        return this.classe;
    }
    public String get_familia(){
        return this.familia;
    }
    public String get_tipo(){
        return this.tipo;
    }

    // métodos set
    public void set_especie(String especie){
        this.especie = especie;
    }
    public void set_nome_cientifico(String nome_cientifico){
        this.nome_cientifico = nome_cientifico;
    }
    public void set_classe(String classe){
        this.classe = classe;
    }
    public void set_familia(String familia){
        this.familia = familia;
    }
    public void set_tipo(String tipo){
        this.tipo = tipo;
    }

    // métodos abstratos
    public abstract void explicar_tipo();

    // métodos superiores
    public void mostrar_planta(){
        System.out.println("Espécie: " + get_especie());
        System.out.println("Tipo: " + get_tipo());
        System.out.println("Nome Científico: " + get_nome_cientifico());
        System.out.println("Classe: " + get_classe());
        System.out.println("Família: " +  get_familia());
    }
}
