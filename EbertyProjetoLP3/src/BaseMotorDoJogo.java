
public class BaseMotorDoJogo { //coloquei abstract, pq nao instancio

    MotorDoJogo ref;

    public MotorDoJogo getMotorDoJogo(Jogador jog) { //posso acrescentar o jogador aqui
        switch (jog.modoJogo) {
            case 1:
                ref = new ModoRapido();
                break;
            case 2:
                ref = new ModoTreino();
                break;
            case 3:
                ref = new ModoCampanha();
                break;
            //case 4:
            //    ref = new Modo2Jogadores();
            //    break;
            default:
                return null;
        }
        return ref;
    }
}
