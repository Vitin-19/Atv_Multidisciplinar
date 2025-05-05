package models;

public abstract class Movimento {
    private double velocidade;
    private double distancia;

    public Movimento(double velocidade, double distancia){
        this.velocidade = velocidade;
        this.distancia = distancia;
    }

    //Métodos set
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    //Métodos get
    public double getVelocidade(){return velocidade;}
    public double getDistancia(){return distancia;}

    public void explicarMovimento(){
        System.out.println("O movimento consiste numa mudança de posição de um corpo ou de um sistema, em relação ao tempo, quando medido por um dado observador\n num referencial determinado. Só se pode medir o movimento relativo. O movimento absoluto não possui significado.");
    }

    public abstract void explicarMovimentoEspecifico();
}
