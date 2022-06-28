package entities;

public abstract class Recebivel {

    private String tipo;
    private Double valor;
    private Integer prazo;

    public Recebivel() {
    }

    public Recebivel(Double valor, Integer prazo) {
        this.valor = valor;
        this.prazo = prazo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public abstract Double valorRecebivel();
}
