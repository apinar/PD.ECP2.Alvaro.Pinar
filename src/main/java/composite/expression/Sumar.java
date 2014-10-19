package composite.expression;

public class Sumar extends Operacion {
	
	public Sumar(Expresion expr, Expresion exp2) {
		super(expr,exp2);
	}

	@Override
	public int operar() {
		return expr.operar()+exp2.operar();
	}

	@Override
	public String toString(){
		return "("+expr.toString()+"+"+exp2.toString()+")";
	}
}
