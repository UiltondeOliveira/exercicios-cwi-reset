package aula05;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Construtor
    public ContaBanco() {
        setSaldo(0.0);
        setStatus(false);
    }

    //Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos
    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);

        if (this.getTipo() == "CC") {
            this.setSaldo(50.00);
        }else{
            this.setSaldo(150.00);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0.0 && getStatus() == true){
            System.out.println("Por favor saque todo o seu saldo antes de fechar a conta.");
        }else if(this.getSaldo() < 0.0 && getStatus() == true){
            System.out.println("Seu saldo está negativo, por favor realize um depósito para quitar seu débito.");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }

    }

    public void depositar(double deposito){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito no valor de " + deposito + " realizado com sucesso!");
        }else{
            System.out.println("Impossível depositar, a conta está fechada.");
        }

    }

    public void sacar(double saque){
        if(this.getStatus() == true) {
            if (getSaldo() < saque) {
                System.out.println("Saldo insuficiente ou negativo");
            } else {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque no valor de " + saque + " realizado com sucesso!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void pagarMensal(){
        double valor;
        if(this.getTipo() == "CC"){
            valor = 12.00;
        }else{
            valor = 20.00;
        }
            if (this.getStatus() == true) {
                if(this.getSaldo() > valor){
                this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Mensalidade no valor de " + valor + " paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }else{
                System.out.println("Impossível pagar.");
            }
    }

    public void extrato(){

        System.out.println("     Seja bem-vindo ao Banco Luna Oliveira!");
        System.out.println(">>>>>_____________________________<<<<<");
        System.out.println("Nº da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Titular da conta: " + getDono());
        System.out.println("Conta aberta? " + getStatus());
        System.out.println("________________________________");
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("");
    }
}
