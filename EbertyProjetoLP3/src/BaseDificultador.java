
public class BaseDificultador {

    Dificultador ref;

    public Dificultador getDificultador(Jogador jog) {
        switch (jog.escolheDif) {
            case 1:
                ref = new DifAleatorio();
                break;
            case 2:
                ref = new DifNivel(jog.nivelAtual);
                break;
            case 3:
                ref = new DifTipo(jog.oper);
                break;
            case 4:
                ref = new DifNivelTipo(jog.nivelAtual, jog.oper);
                break;
            default:
                return null;
        }
        return ref;
    }
    /*public Dificultador getDificultador(){
        ref = new DifAleatorio();
        return ref;
     }  
    
     public Dificultador getDificultador(int nivel){
        ref = new DifNivel(nivel);
        return ref;
     }
    
     public Dificultador getDificultador(char tipo){
        ref = new DifTipo(tipo);
        return ref;
     }
    
     public Dificultador getDificultador(int nivel, char tipo){
        ref = new DifNivelTipo(nivel, tipo);
        return ref;
     }
    
     public Dificultador getDificultador(double n1, double n2){
        double aux;
        if(n1 > n2){
            aux = n2;
            n2 = n1;
            n1 = aux;
        }
        ref = new DifIntervalo(n1, n2);
        return ref;
     }*/
}
