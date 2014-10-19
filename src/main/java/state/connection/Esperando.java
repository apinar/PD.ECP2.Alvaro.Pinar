package state.connection;

public class Esperando extends State{

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
		if (respuesta == 0) {
            this.estado = Estado.PREPARADO;
        } else {
            this.estado = Estado.CERRADO;
        }
	}

}
