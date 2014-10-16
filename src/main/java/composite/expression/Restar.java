package composite.expression;

public class Restar extends Operacion {
	private Operacion expr;
	
	public Restar(Operacion expr, Numero operador) {
		super(operador);
		this.expr=expr;
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
