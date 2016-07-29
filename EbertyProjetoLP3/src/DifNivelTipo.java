
import java.util.ArrayList;
import java.util.Random;

public class DifNivelTipo implements Dificultador {

    public int nivel;
    public char tipo;

    DifNivelTipo(int nivel, char tipo) {
        this.nivel = nivel;
        this.tipo = tipo;
    }

    @Override
    public Expressao getExpressao(ArrayList<Expressao> listExp) {
        Random aleatorio = new Random();
        Expressao exp;

        do {
            exp = listExp.get(aleatorio.nextInt(listExp.size()));
        } while (exp.getNivel() != nivel || exp.getTipo() != tipo);

        return exp;
    }

    @Override
    public String retornaInfo(Expressao exp, char info) {
        return "Não há informações a retornar";
    }
}
