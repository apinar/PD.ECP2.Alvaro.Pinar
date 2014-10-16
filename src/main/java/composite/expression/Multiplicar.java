package composite.expression;

public class Multiplicar extends Operacion {
	private Operacion expr;
	
	public Multiplicar(Operacion expr, Numero operador) {
		super(operador);
		this.expr=expr;
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
