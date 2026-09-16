public class PantallaInicio {
    public void mostrar() {
        ConfiguracionInterfaz config = ConfiguracionInterfaz.getInstancia();
        System.out.println("Bienvenido a la aplicación!");
        System.out.println("Idioma actual: " + config.getIdioma());
        System.out.println("Tamaño de fuente: " + config.getTamañoFuente());
    }
}
