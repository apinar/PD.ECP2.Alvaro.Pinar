package state.connection;

public abstract class State {
	protected Estado estado;
	protected Conexion conexion;
	
	public abstract void abrir();
	public abstract void cerrar();
	public abstract void parar();
	public abstract void iniciar();
	public abstract void enviar(String msg);
	public abstract void recibir(int respuesta);
	
	public abstract Estado getEstado();
	
}
