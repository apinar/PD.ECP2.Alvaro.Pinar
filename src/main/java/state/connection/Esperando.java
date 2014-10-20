package state.connection;

public class Esperando extends State{

	public Esperando(Conexion conexion) {
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
            this.conexion.setState(new Preparado(conexion));
        } else {
            this.conexion.setState(new Cerrado(conexion));
        }
	}
	
	public Estado getEstado(){
		return Estado.ESPERANDO;
		
	}

}
