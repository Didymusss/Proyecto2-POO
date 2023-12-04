public interface Sujeto{
    public void register(Observador obj);
    public void unregister(Observador obj);

    public void notificar();
    
    public Object getNotificacion(Observador obj);
}
