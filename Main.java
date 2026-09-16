public class Main {
    public static void main(String[] args) {
        ConfiguracionInterfaz config = ConfiguracionInterfaz.getInstancia();
        config.setIdioma("ES");
        config.setTamañoFuente(20);
        PantallaInicio Inicio = new PantallaInicio();
        Inicio.mostrar();
        PantallaAjustes Ajustes = new PantallaAjustes();
        Ajustes.mostrar();
    }
}
