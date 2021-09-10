package projetopessoafinal;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(int aumento) {
        System.out.println("O professor(a) " + this.nome + " recebeu um aumento de R$ " + aumento + ",00");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
