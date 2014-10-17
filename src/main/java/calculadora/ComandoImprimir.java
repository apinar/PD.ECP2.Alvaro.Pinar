package calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {
	Calculadora c;
	public ComandoImprimir(Calculadora calc) {
		this.c=calc;
	}

	@Override
	public String name() {
		return "Imprimir: ";
	}

	@Override
	public void execute() {
		//New vista -> IO.readInt()
		IO.out.println(c.getTotal());
	}

}
