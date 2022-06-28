package entities;

public class Trabalhador {

    private String nome;
    private Double salarioPorHora;
    private Double horasTrabalhadas;

    public Trabalhador() {
    }

    public Trabalhador(String nome, Double salarioPorHora, Double horasTrabalhadas) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(Double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double SalarioTotal (){
        return salarioPorHora * horasTrabalhadas;
    }

    @Override
    public final String toString() {
        return "Nome: " + nome +
                ", Salario Por Hora: " + salarioPorHora +
                ", Horas Trabalhadas: " + horasTrabalhadas +
                ", Salario: " + SalarioTotal();
    }
}
