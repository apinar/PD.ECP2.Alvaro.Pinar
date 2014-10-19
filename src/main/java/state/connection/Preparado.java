package state.connection;

public class Preparado extends State{

	@Override
	public void abrir() {
		//assert false : "estado imposible";
	}

	@Override
	public void cerrar() {
		this.estado = Estado.CERRADO;
	}

	@Override
	public void parar() {
		this.estado = Estado.PARADO;
	}

	@Override
	public void iniciar() {
		//assert false : "estado imposible";
		
	}

	@Override
	public void enviar(String msg) {
		this.link.enviar(msg);
        this.estado = Estado.ESPERANDO;
		
	}

	@Override
	public void recibir(int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

}
