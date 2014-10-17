package calculadoraMementable;

import upm.jbb.IO;
import calculadora.Comando;

public class ComandoGuardar implements Comando{
	GestorMementos<MementoCalculadora> gm;
	CalculadoraMementable c;
	
	public ComandoGuardar(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		this.c=calc;
		this.gm=gm;
	}
		
	@Override
	public String name() {
		return "Guardar: ";
	}

	@Override
	public void execute() {
		gm.addMemento(IO.in.readString( "Dame una clave para identificar el memento"), c.createMemento());
	}
	

}
