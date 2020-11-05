package questao1;
public class Ponto3D extends Ponto{
    
    private double z;
    
    public Ponto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    
    @Override
    public String toString(){
       return super.toString() +" and z:" +this.z;
    }
}
