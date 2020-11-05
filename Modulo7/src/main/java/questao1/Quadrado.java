package questao1;
public class Quadrado implements AreaCalculavel {

    
    int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    @Override
    public void calcularArea() {
        System.out.println("Area eh " +lado*lado);
    }
}
