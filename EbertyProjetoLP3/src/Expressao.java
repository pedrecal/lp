
public final class Expressao {

    private int nivel;
    private char tipo;
    private String expr;
    private double resp;

    public Expressao(int nivel, char tipo, String exp, double resp) {
        setNivel(nivel);
        setTipo(tipo);
        setExpr(exp);
        setResp(resp);
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 5) {
            this.nivel = nivel;
        } else {
            System.out.println("Nivel invalido!");
        }
    }

    public void setTipo(char tipo) {
        switch (tipo) {
            case 'a':
            case 's':
            case 'm':
            case 'd':
                this.tipo = tipo;
                break;
            default:
                System.out.println("Tipo invalido!");
                break;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public char getTipo() {
        return tipo;
    }

    public String getExpressao() {
        return getExpr();
    }

    public double getResposta() {
        return getResp();
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public double getResp() {
        return resp;
    }

    public void setResp(double resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return nivel + "    " + tipo + "    " + getExpr() + "   " + getResp();
    }

    public String exibirExpressao() {
        return "Qual a resposta para: " + getExpr() + "? ";
    }

}
