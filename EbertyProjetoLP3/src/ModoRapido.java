
public class ModoRapido implements MotorDoJogo {

    private int qQuest;
    Dificultador ref;
    BaseDificultador dif = new BaseDificultador();

    @Override
    public Dificultador solicitarDif(Jogador jog) {//igual pra td mundo, fazer super clase
        this.ref = dif.getDificultador(jog);
        return ref;
    }

    @Override
    public boolean jogoDeFases(Jogador jog) {//jogo rapido nao pode mudar de fase, ou eh a msm sempre ou eh aleatoria
        return false;
    }

    @Override
    public boolean jogoAcabou(Jogador jog) { //se ele errou 3 ou se ele atigiu a qtd max de questoes
        if (jog.getErros() >= 3)
            return true;
        if (jog.isContinua() == false)
            return true;
        return (jog.getqQuestResp() >= getqQuest());
    }

    @Override
    public boolean acertou(Expressao exp, Jogador jog) {
        jog.setqQuestResp(jog.getqQuestResp() + 1);
        if (exp.getResposta() != jog.getResp()) {
            jog.setErros(jog.getErros() + 1);
            return false;
        } else {
            jog.setPontos(jog.getPontos() + 20);
            return true;
        }
    }

    @Override
    public boolean repetir(Jogador jog) { //modo rapido nao pode repetir
        return false;
    }

    @Override
    public boolean passarFase(Jogador jog) { //nao ah fazes nesse modo
        return false;
    }

    @Override
    public int getqQuest() {
        return qQuest;
    }

    @Override
    public void setqQuest(int qQuest) { //max de 20 questoes
        if (qQuest <= 20 && qQuest > 0) {
            this.qQuest = qQuest;
        } else if (qQuest > 20) {
            this.qQuest = 20;
        } else {
            this.qQuest = 0;
        }
    }
}
