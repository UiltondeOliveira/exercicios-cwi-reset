package aula04;

public class Personagens {
    private String nome;
    private int idade;
    private double altura;
    private int stamina;
    private int moedasColetadas;
    private int qtdeVidas;

/*    public Personagens() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.stamina = 100;
        this.moedasColetadas = 0;
        this.qtdeVidas = 1;
    }*/


    public Personagens(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.stamina = 100;
        this.moedasColetadas = 0;
        this.qtdeVidas = 1;
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
        this.stamina = this.stamina - 10;
        if(this.stamina < 0){
            this.stamina = 0;
        }
    }

    public void ganharStamina(){
        this.stamina = this.stamina + 5;
        if(this.stamina > 100){
            this.stamina = 100;
        }
    }

    public void crescer(){
        this.altura = this.altura * 2;
    }

    public void revigorar(){
        this.stamina = 100;
    }

    public void morrer(){
        this.stamina = 0;
        this.qtdeVidas --;
        if(qtdeVidas < 0){
            this.qtdeVidas = 0;
        }else{
            revigorar();
        }

    }

    public void coletarMoeda(){
        this.moedasColetadas ++;
        int aumentaVida = (this.moedasColetadas / 10);
        if(this.moedasColetadas % 10 == 0){
            this.qtdeVidas ++;
        }
    }

    public void saltar() {
        if(this.getNome() == "Mario") {
            System.out.println("Altura do pulo: " + (getAltura() * 0.5) + " m");
        }else if(this.getNome() == "Luigi"){
            System.out.println("Altura do pulo: " + (getAltura() * 2) + " m");
        }
    }

    public void status() {
        System.out.println("Nome: " + nome + ", idade: " + idade +
                            ", altura: " + altura + "m, Stamina: " + stamina +
                            ", Vidas: " + qtdeVidas + ", Moedas: " + moedasColetadas);
    }
}
