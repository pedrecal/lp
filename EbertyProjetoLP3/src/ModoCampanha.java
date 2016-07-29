
public class ModoCampanha implements MotorDoJogo {

    private int qQuest;
    Dificultador ref;
    BaseDificultador dif = new BaseDificultador();

    @Override
    public Dificultador solicitarDif(Jogador jog) { //igual pra td mundo, fazer super clase
        this.ref = dif.getDificultador(jog);
        return ref;
    }

    @Override
    public boolean jogoDeFases(Jogador jog) { //eh campanha
        return true;
    }

    @Override
    public boolean jogoAcabou(Jogador jog) {
        if (jog.getErros() > jog.qPodeErrar) {
            return true;
        }
        return (!jog.isContinua()); //ou true(ver)
    }

    @Override
    public boolean acertou(Expressao exp, Jogador jog) {
        if (jog.isRepete() == true) //se eh a primeira vez q ele ta jogando
            jog.setqQuestResp(jog.getqQuestResp() + 1);
        
        if (exp.getResposta() != jog.getResp()) {
            if (jog.isRepete() == true) //se eh a primeira vez q ele ta jogando
                jog.setErros(jog.getErros() + 1);
            jog.setRepete(false);
            return false;
        } else {
            if (jog.isRepete() == true) {
                jog.setPontos(jog.getPontos() + 10);
            } else {
                jog.setPontos(jog.getPontos() + 20);
            }
            jog.setRepete(true);
            return true;
        }
    }

    @Override
    public boolean repetir(Jogador jog) {
        if (jog.isRepete()) {
            jog.setRepete(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean passarFase(Jogador jog) {
        return (jog.getPontos() / jog.nivelAtual == qQuest * 20) && (jog.nivelAtual < 5);
    }

    @Override
    public int getqQuest() {
        return qQuest;
    }

    @Override
    public void setqQuest(int qQuest) { //12 questoes por nivel
        this.qQuest = 60;
    }
}
