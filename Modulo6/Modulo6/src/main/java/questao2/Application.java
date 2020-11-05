package questao2;
public class Application {
    
    public static void main(String[] args) {
        
        
        Automovel a = new Automovel();
        Motocicleta b = new Motocicleta();
        Onibus c = new Onibus();
        
        a.ligar(); 
        b.ligar();
        c.ligar();
        
        System.out.println(a.isLigado()); 
        
        a.desligar();
        b.desligar();
        c.desligar();
        
        System.out.println(a.isLigado());
    }
}
