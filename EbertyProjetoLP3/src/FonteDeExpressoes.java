
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FonteDeExpressoes {

    public static int totExp = 0;
    ArrayList<Expressao> lista;

    public FonteDeExpressoes() {
        LerExpressao();
    }

    private void LerExpressao() {
        BufferedReader br = null;
        lista = new ArrayList<>(); //ArrayList<Expressao>(400); isso nao da erro

        try {
            String s;
            br = new BufferedReader(new FileReader("Lp3.txt"));
            String strAux[] = new String[4];

            while ((s = br.readLine()) != null) {
		//StringTokenizer tokens = new StringTokenizer(s);
                //Expressao aux = new Expressao(Integer.parseInt(tokens.nextToken("\t")), tokens.nextToken("\t").charAt(0),tokens.nextToken("\t"), Double.parseDouble(tokens.nextToken()));
                strAux = s.split("\t");
                Expressao aux = new Expressao(Integer.parseInt(strAux[0]), strAux[1].charAt(0), strAux[2], Double.parseDouble(strAux[3]));
                totExp++; //ver quantas expressoes tem ao todo
                lista.add(aux);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<Expressao> GetVet() {
        return lista;
    }
}
