package visibilidade;

public class ExemploVisibilidade {
    public static void main(String[] args) {
        CanetaVisibilidade c1 = new CanetaVisibilidade();

        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
