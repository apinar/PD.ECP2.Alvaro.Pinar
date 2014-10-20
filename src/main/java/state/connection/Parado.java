package state.connection;

public class Parado extends State{

	public Parado(Conexion conexion) {
		this.conexion=conexion;
	}

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
	}

	@Override
	public void iniciar() {
		this.conexion.setState(new Preparado(conexion));
	}

	@Override
	public void enviar(String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public Estado getEstado(){
		return Estado.PARADO;
		
	}
}
