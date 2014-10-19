package state.connection;

public class Parado extends State{

	@Override
	public void abrir() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar() {
		//assert false : "estado imposible";
	}

	@Override
	public void iniciar() {
		this.estado = Estado.PREPARADO;
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
