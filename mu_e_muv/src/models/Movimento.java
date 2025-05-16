package models;

public abstract class Movimento {
    private double velocidade;
    private double distancia;
    private double tempo;

    public Movimento(double velocidade, double distancia, double tempo){
        this.velocidade = velocidade;
        this.distancia = distancia;
        this.tempo = tempo;
    }

    //Métodos set
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public void setTempo(double tempo){
        this.tempo = tempo;
    }

    //Métodos get
    public double getVelocidade(){return velocidade;}
    public double getDistancia(){return distancia;}
    public double getTempo(){return tempo;}

    public void explicarMovimento(){
        System.out.println("O movimento consiste numa mudança de posição de um corpo ou de um sistema, em relação ao tempo, quando medido por um dado observador\n num referencial determinado. Só se pode medir o movimento relativo. O movimento absoluto não possui significado.");
    }

    public abstract void explicarMovimentoEspecifico();
    public abstract void mostrarFormulas();
}
