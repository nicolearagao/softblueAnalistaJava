
package questao2;

public class Data{

    private int dia;
    private int mes;
    private int ano;
    private int hora = -1;
    private int minuto =-1;
    private int segundo=-1;
     
    public static final int FORMATO_12 = 1;
    public static final int FORMATO_24 =2;
    
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(int dia, int mes, int ano, int hora, int minuto, int segundo){
        this(dia, mes, ano);
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
   
    
  
	public void imprimir(int formato) {
		
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			// Se hora for -1, significa que os dados de horário não foram passado no construtor.
			// Então exibe só a data
			System.out.println(data);
		} else {
			
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == FORMATO_24) {
				
				horario = hora + horario;
			} else {
				// Se o formato for 12h
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				
				} else if (hora >= 12) {
					
					horario = (hora - 12) + horario;
					horario += " PM";
				
				} else {
					
					horario = hora + horario;
					horario += " AM";
				}
			}

			// Imprime a data/hora formatada
			System.out.println(data + " " + horario);
		}
	}


    
    
}