package models;

public interface Formulas_MUV {
    public double sorvetao(double v0, double s0, double aceleracao, double tempo);
    public double voat(double v0, double aceleracao, double tempo);
    public double torricelli(double v0, double deltaS, double aceleracao);
}
