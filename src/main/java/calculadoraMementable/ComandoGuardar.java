package calculadoraMementable;

import upm.jbb.IO;
import calculadora.Calculadora;
import calculadora.Comando;

public class ComandoGuardar implements Comando{
	GestorMementos gm;
	Calculadora  c;
	
	public ComandoGuardar(Calculadora calc, GestorMementos gm) {
		this.c=calc;
		this.gm=gm;
	}
		
	@Override
	public String name() {
		return "Guardar: ";
	}

	@Override
	public void execute() {
		// Pide al IO una clave
		// A la calculadora le pide un memento.
		// Guarda el memento y la clave en el gm
		
		
	}
	

}
