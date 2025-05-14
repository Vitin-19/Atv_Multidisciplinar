package models;

public class Movimento_Uniforme extends Movimento {
    public Movimento_Uniforme(double velocidade, double distancia){
        super(velocidade, distancia);
    }

    @Override
    public void explicarMovimentoEspecifico(){
        System.out.println("Movimento uniforme é a variação do espaço de um objeto quando a velocidade dele não varia ");
    }
}
