package composite.expression;

public abstract class Operacion extends Expresion{
	protected Expresion expr;
	protected Expresion exp2;
	
	public Operacion (Expresion expr,Expresion exp2){
		this.expr=expr;
		this.exp2=exp2;
		this.isExpresion=true;
	}
	

}
