package composite.expression;

public class Numero extends Expresion{
	private int numero;
	
	public Numero(int numero) {
		this.numero=numero;
		this.isExpresion=false;
	}

	@Override
	public int operar() {
		return numero;
	}
	
	@Override
	public String toString(){
		return Integer.toString(numero);
	}

}
