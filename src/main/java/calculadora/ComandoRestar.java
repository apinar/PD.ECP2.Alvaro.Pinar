package calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando{
	Calculadora c;
	
	public ComandoRestar(Calculadora calc) {
		this.c=calc;
	}

	@Override
	public String name() {
		return "Resta: ";
	}

	@Override
	public void execute() {
		c.restar(IO.in.readInt());		
	}

}
