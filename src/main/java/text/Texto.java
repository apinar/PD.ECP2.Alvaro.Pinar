package text;

public class Texto extends Composite{

	@Override
	public void add(Componente componente) {
		if (!componente.isCompuesto()) {
			throw new UnsupportedOperationException("Operación no soportada");
		}else{
			this.elementos.add(componente);
		}
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String texto = this.dibujar(mayusculas);
		texto += "---o---\n";
		return texto;
	}

}
