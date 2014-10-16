package composite.expression;

public class Sumar extends Operacion {
	private Operacion expr;
	
	public Sumar(Operacion expr, Numero operador) {
		super(operador);
		this.expr=expr;
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
