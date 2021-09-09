package aula05;

public class ExContaBanco {
    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco();

        c1.setNumConta(11111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(150);
        c1.fecharConta();
        c1.extrato();

      ContaBanco c2 = new ContaBanco();
        c2.setNumConta(22222);
        //c2.setTipo("CC");
        c2.setDono("Creuza");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        c2.extrato();
    }
}
