package questao1;
public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    @Override
    public String toString(){
        return "x: " +this.x +" and y:" +y;
    }
}
