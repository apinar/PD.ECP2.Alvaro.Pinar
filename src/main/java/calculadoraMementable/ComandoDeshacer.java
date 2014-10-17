package calculadoraMementable;

import calculadora.Calculadora;
import calculadora.Comando;

public class ComandoDeshacer implements Comando{
	GestorMementos gm;
	Calculadora c;
	
	public ComandoDeshacer(Calculadora calc, GestorMementos gm) {
		this.c=calc;
		this.gm=gm;
	}
	
	
	@Override
	public String name(){
		return "Deshacer: ";
	}

	@Override
	public void execute() {
		//Da la lista de puntos de restauracion
		//Pide un punto
		//Restaura el punto		
	}

}
