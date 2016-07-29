
public class Jogador {

    public int modoJogo;
    public int escolheDif;
    public int qPodeErrar;
    public double resp;

    private boolean continua = true;
    private boolean repete; //true
    private boolean jogoComFases;

    int nivelAtual;
    char oper;

    private int qQuestResp = 0;
    private int erros = 0;
    private int pontos = 0;

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getResp() {
        return resp;
    }

    public void setResp(double resp) {
        this.resp = resp;
    }

    public int getqQuestResp() {
        return qQuestResp;
    }

    public void setqQuestResp(int qQuestResp) {
        this.qQuestResp = qQuestResp;
    }

    public boolean isContinua() {
        return continua;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }

    public boolean isRepete() {
        return repete;
    }

    public void setRepete(boolean repete) {
        this.repete = repete;
    }

    public boolean isJogoComFases() {
        return jogoComFases;
    }

    public void setJogoComFases(boolean jogoComFases) {
        this.jogoComFases = jogoComFases;
    }
}
