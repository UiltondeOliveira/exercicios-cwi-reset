package metodosEspeciais;

public class metodosEspeciais {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC",0.7,"Vermelha", true);

/*        c1.setModelo("BIC");
        c1.setPonta(0.5);*/
        //c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + ", na cor " + c1.getCor() + ", de ponta " + c1.getPonta() + " mm e está tampada? " + c1.isTampada());

    }
}
