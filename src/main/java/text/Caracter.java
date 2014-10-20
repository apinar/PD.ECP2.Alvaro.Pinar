package text;

public class Caracter extends Componente{
	private char caracter;

	
	public Caracter (char c){
		caracter=c;
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
	}

	@Override
	public String dibujar(boolean mayusculas) {
		if (mayusculas){
			return Character.toString(caracter).toUpperCase();
		}else{
			return Character.toString(caracter);
		}
			
	}

	public Componente get(char c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isCompuesto() {
		return false;
	}

}
