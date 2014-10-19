package composite.expression;

public abstract class Operacion extends Expresion{
	private Expresion expr;
	private Numero numero;
	
	public Operacion (Expresion expr,Numero numero){
		this.numero=numero;
		this.expr=expr;
		this.isExpresion=false;
	}
	

}
