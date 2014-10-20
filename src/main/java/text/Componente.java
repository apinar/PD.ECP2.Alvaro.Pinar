package text;

public abstract class Componente {
	
	public abstract Boolean isCompuesto();
	
	public abstract void add(Componente componente);

	public abstract String dibujar(boolean car);

}
