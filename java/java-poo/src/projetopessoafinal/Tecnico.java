package projetopessoafinal;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar() {
        System.out.println("O aluno " + this.nome+ " está praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
