public class PantallaAjustes {
    public void mostrar() {
        ConfiguracionInterfaz config = ConfiguracionInterfaz.getInstancia();
        System.out.println("Idioma actual: " + config.getIdioma());
        System.out.println("Tamaño de fuente: " + config.getTamañoFuente());
    }

}
