public class Main {
    public static void main(String[] args) {
        ConfiguracionInterfaz config = ConfiguracionInterfaz.getInstancia();
        config.setIdioma("EN");
        config.setTamañoFuente(20);
        PantallaInicio Inicio = new PantallaInicio();
        Inicio.mostrar();
        PantallaAjustes Ajustes = new PantallaAjustes();
        Ajustes.mostrar();
    }
    //¿Por qué PantallaInicio y PantallaAjustes ven exactamente la misma configuración aunque cada una
    //llame a getInstancia() por separado?
    //Porque estan utilizando la misma Instancia, en la primera llamada se crea la instancia, ya que no hya una previamente
    //y en la segunda llamada como la instancia si esta creada, se devuelve esa misma instancia, por lo que ambas clases ven la misma configuración.
}
