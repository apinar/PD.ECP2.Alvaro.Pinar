package state.connection;

public class Cerrado extends State{

	public Cerrado(Conexion conexion) {
		this.conexion=conexion;
	}

	@Override
	public void abrir() {
		super.conexion.setState(new Preparado(super.conexion));
		
	}

	@Override
	public void cerrar() {
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

	public Estado getEstado(){
		return Estado.CERRADO;
		
	}
}
