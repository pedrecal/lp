
public interface MotorDoJogo {

    public Dificultador solicitarDif(Jogador jog);

    public boolean jogoAcabou(Jogador jog);

    public boolean acertou(Expressao exp, Jogador jog); //+ pontuacao do jogador

    public boolean repetir(Jogador jog);

    public boolean jogoDeFases(Jogador jog);

    public boolean passarFase(Jogador jog);

    //diser pontuacao final do jogador

    public int getqQuest();

    public void setqQuest(int qQuest);

    /*Pra implementar se der tempo*/
    //rankin de jogadores (arquivo de texto)
}
