package entities;

public class Promissoria extends Recebivel implements IRecebivel {

    public Promissoria(Double valor, Integer prazo) {
        super(valor, prazo);
    }

    @Override
    public Double valorRecebivel() {
        return getValor();
    }

    @Override
    public double calcularRecebivel(double valor) {
        if (getPrazo() <= 30) {
            return valor * 0.04 / 100;
        } else if (getPrazo() <= 60) {
            return valor * 0.075 / 100;
        } else if (getPrazo() <= 90) {
            return valor * 0.085 / 100;
        } else {
            return valor * 0.02 / 100;
        }
    }
}
