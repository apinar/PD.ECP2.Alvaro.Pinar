package text;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Componente{

	protected final List<Componente> elementos = new ArrayList<Componente>();
	
	
	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
	}
	
	
	@Override
	public String dibujar(boolean mayusculas) {
		String cadena = "";
		for (Componente componente : elementos) {
			cadena += componente.dibujar(mayusculas);
		}
		return cadena;
	}


	@Override
	public Boolean isCompuesto() {
		return true;
	}

}
