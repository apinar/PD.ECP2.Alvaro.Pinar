package state.connection;

public class Preparado extends State{

	public Preparado(Conexion conexion) {
		this.conexion=conexion;
	}

	@Override
	public void abrir() {
	}

	@Override
	public void cerrar() {
		this.conexion.setState(new Cerrado(conexion));
	}

	@Override
	public void parar() {
		this.conexion.setState(new Parado(conexion));
	}

	@Override
	public void iniciar() {		
	}

	@Override
	public void enviar(String msg) {
		this.conexion.getLink().enviar(msg);
        this.conexion.setState(new Esperando(conexion));
		
	}

	@Override
	public void recibir(int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}
	
	public Estado getEstado(){
		return Estado.PREPARADO;
		
	}
	
}
