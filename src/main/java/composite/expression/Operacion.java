package composite.expression;

public abstract class Operacion {
	private int operador;
	
	public Operacion(int operador){
		this.operador=operador;
	}
	
	public abstract int operar();

}
