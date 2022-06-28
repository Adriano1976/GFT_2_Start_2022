package entities;

public class Cheque extends Recebivel implements IRecebivel {

    public Cheque(Double valor, Integer prazo) {
        super(valor, prazo);
    }

    @Override
    public Double valorRecebivel() {
        return getValor();
    }

    @Override
    public double calcularRecebivel(double valor) {
        if (getPrazo() <= 30){
            return valor * 0.05 / 100;
        } else if (getPrazo() <= 60){
            return valor * 0.075 / 100;
        } else if (getPrazo() <= 90) {
            return valor * 0.01 / 100;
        } else {
            return valor * 0.03 / 100;
        }
    }
}
