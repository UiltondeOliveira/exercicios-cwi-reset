package mario;

public class Mario {
    public String nome;
    public double altura;
    public String corOlhos;
    protected String corCamisa;
    protected String corSapatos;
    protected int estamina;

    protected String poder1;
    private String poder2;
    private String poder3;

    void caracteristicas(){
        System.out.println("Nome: "+ this.nome + "; Altura: " + this.altura + "m;" + " Cor dos olhos: " + this.corOlhos +
                "; Cor da camisa: " + this.corCamisa + "; Cor dos sapatos: " + this.corSapatos);
        System.out.println();
    }

    void superpoderes(){
        System.out.println("Poderes: " + this.poder1 + "; " + this.poder2 + "; " + this.poder3);
    }
}
