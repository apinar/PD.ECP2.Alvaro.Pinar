package composite.expression;

public class Dividir extends Operacion {
	private Operacion expr;
	
	public Dividir(Operacion expr, Numero operador) {
		super(operador);
		this.expr=expr;
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
