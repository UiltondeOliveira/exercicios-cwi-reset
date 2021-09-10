package aula04;

public class ExPersonagens {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Teste Mário");
        System.out.println("-------------------------------------------");
        Personagens mario = new Personagens("Mario",40,1.60);
        mario.status();
        mario.saltar();
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Teste Luigi");
        System.out.println("-------------------------------------------");
        Personagens luigi = new Personagens("Luigi",40,1.80);
        luigi.status();
        luigi.saltar();
        System.out.println("-------------------------------------------");

    }
}
