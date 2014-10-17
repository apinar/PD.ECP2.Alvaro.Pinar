package calculadora;

public class ComandoIniciar implements Comando{
	Calculadora c;
	
	public ComandoIniciar(Calculadora calc) {
		this.c=calc;
	}

	@Override
	public String name() {
		return "Inicia: ";
	}

	@Override
	public void execute() {
		c.iniciar();
		
	}

}
