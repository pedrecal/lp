
import java.util.ArrayList;
import java.util.Random;

public class DifAleatorio implements Dificultador {

    public DifAleatorio() {

    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        return listExp.get(aleatorio.nextInt(listExp.size()));
    }

    @Override
    public String retornaInfo(Expressao exp, char info) {
        switch (info) {
            case 's':
                return "Você esta a responder uma questão do nivel: " + exp.getNivel() + " com uma operacao do tipo " + exp.getTipo();
            default:
                return "";
        }
    }

}
