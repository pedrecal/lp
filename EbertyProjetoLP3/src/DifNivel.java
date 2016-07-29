
import java.util.ArrayList;
import java.util.Random;

public class DifNivel implements Dificultador {

    public int nivel;

    public DifNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        Expressao exp;

        do {
            exp = listExp.get(aleatorio.nextInt(listExp.size()));
        } while (exp.getNivel() != nivel);

        return exp;
    }

    @Override
    public String retornaInfo(Expressao exp, char info) {
        switch (info) {
            case 's':
                return "Você esta a responder uma questão do tipo " + exp.getTipo();
            default:
                return "";
        }
    }

}
