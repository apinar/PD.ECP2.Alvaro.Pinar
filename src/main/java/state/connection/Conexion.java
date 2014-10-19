package state.connection;

public class Conexion {
    private State estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Cerrado(Estado.CERRADO);
    }

    public Link getLink() {
        return link;
    }
    
    private void setState(State estado){
    	this.estado=estado;
    }

    public Estado getEstado() {
        return estado.getEstado();
    }

    public void abrir() {
        estado.abrir();
    }

    public void cerrar() {
        estado.cerrar();
    }

    public void parar() {
        estado.parar();
    }

    public void iniciar() {
       estado.iniciar();
    }

    public void enviar(String msg) {
        estado.enviar(msg);
    }

    public void recibir(int respuesta) {
        estado.recibir(respuesta);
    }

}
