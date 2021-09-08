package mario;

public class Exercicio {
    public static void main(String[] args) {
        Mario m1 = new Mario();

        m1.nome = "Mário";
        m1.altura = 1.65;
        m1.corOlhos = "Azuis brilhantes";
        m1.corCamisa = "Vermelha";
        m1.corSapatos = "Marrons";

      m1.poder1 = "Força sobre-humana";
/*    m1.poder2 = "Superhuman speed";
      m1.poder3 = "Superhuman stamina";
*/

        m1.caracteristicas();
        m1.superpoderes();
    }
}
