package calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {
	Calculadora c;
	
	public ComandoSumar(Calculadora calc) {
		this.c=calc;
	}

	@Override
	public String name() {
		return "Suma: ";
	}

	@Override
	public void execute() {
		c.sumar(IO.in.readInt());
	}

}
