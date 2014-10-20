package text;

public class Parrafo extends Composite{

	@Override
	public void add(Componente componente) {
		if (componente.isCompuesto()) {
			throw new UnsupportedOperationException("Operación no soportada");
		}else{
			this.elementos.add(componente);
		}
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String parrafo = this.dibujar(mayusculas);
		parrafo += "\n";
		return parrafo;
	}

}
