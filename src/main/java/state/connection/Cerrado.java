package state.connection;

public class Cerrado extends State{

	public Cerrado(Estado cerrado) {
		this.estado=cerrado;
	}

	@Override
	public void abrir() {
		this.estado = Estado.PREPARADO;
	}

	@Override
	public void cerrar() {
		//assert false : "estado imposible";
		
	}

	@Override
	public void parar() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public void recibir(int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
