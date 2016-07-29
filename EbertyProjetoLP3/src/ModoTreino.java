
public class ModoTreino implements MotorDoJogo {

    private int qQuest;
    Dificultador ref;
    BaseDificultador dif = new BaseDificultador();

    @Override
    public Dificultador solicitarDif(Jogador jog) {//igual pra td mundo, fazer super clase
        this.ref = dif.getDificultador(jog);
        return ref;
    }

    @Override
    public boolean jogoDeFases(Jogador jog) { //jogador escolhe se quer fase ou nao
        return jog.isJogoComFases();
    }

    @Override
    public boolean jogoAcabou(Jogador jog) { //jogador escolhe a qtd de erros q pode cometer, se ele fizer tudo acabou
        if (jog.getErros() > jog.qPodeErrar)
            return true;
        if (jog.getqQuestResp() >= getqQuest())
            return true;
        return (!jog.isContinua()); //ele escolhe se quer acabar
    }

    @Override
    public boolean acertou(Expressao exp, Jogador jog) {
        jog.setqQuestResp(jog.getqQuestResp() + 1);
        if (exp.getResposta() != jog.getResp()) {
            jog.setErros(jog.getErros() + 1);
            jog.setRepete(true);
            return false;
        } else { //olhar se ta fazendo de novo
            if (jog.isRepete() == false) {
                jog.setPontos(jog.getPontos() + 10);
            } else {
                jog.setPontos(jog.getPontos() + 20);
            }
            return true;
        }
    }

    @Override
    public boolean repetir(Jogador jog) {
        return true; //por ser treino, ele repete quantas veses quiser
    }

    @Override
    public boolean passarFase(Jogador jog) { //ele decide se quer passar de fase ou nao a cada 1/5 das questoes
        if (jog.getqQuestResp() >= qQuest / 5) {
            if (jog.nivelAtual < 5) {
                return jog.isJogoComFases();
            }
        }
        return false;
    }

    @Override
    public int getqQuest() {
        return qQuest;
    }

    @Override
    public void setqQuest(int qQuest) { //faz quantas quiser
        if (qQuest > 0) {
            this.qQuest = qQuest;
        } else {
            this.qQuest = 0;
        }
    }
}
