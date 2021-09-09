package aula04;

public class Aula04 {
    private String nome;
    private int idade;
    private double altura;
    private int stamina;

    public Aula04() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.stamina = 100;
    }

    public Aula04(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.stamina = 100;

    }
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public int getStamina() {

        return stamina;
    }

    public void setStamina(int stamina) {

        this.stamina = stamina;
    }

    public void perderStamina(){

        this.setStamina(this.getStamina() - 10);
        if(this.getStamina() < 0){
            this.setStamina(0);
        }
    }

    public void ganharStamina(){
        this.setStamina(this.getStamina() + 5);
        if(this.getStamina() > 100){
            this.setStamina(100);
        }
    }

    public void crescer(){
        this.setAltura(this.getAltura() * 2);
    }

    public void status() {
        System.out.println("Nome: " + getNome() + ", idade: " + getIdade() +
                            ", altura: " + getAltura() + "m, Stamina: " + getStamina() + "%.");
    }
}
