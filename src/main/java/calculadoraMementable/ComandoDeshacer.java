package calculadoraMementable;

import upm.jbb.IO;
import calculadora.Calculadora;
import calculadora.Comando;

public class ComandoDeshacer implements Comando{
	GestorMementos<MementoCalculadora> gm;
	CalculadoraMementable c;
	
	public ComandoDeshacer(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		this.c=calc;
		this.gm=gm;
	}
	
	@Override
	public String name(){
		return "Deshacer: ";
	}

	@Override
	public void execute() {
		//Da la lista de puntos de restauracion -> IO
		c.restoreMemento(gm.getMemento(IO.in.readString("Dame una clave para recuperar el memento")));		
	}
}
