public class ConfiguracionInterfaz {
    private static ConfiguracionInterfaz instancia;

    private String Idioma;
    private int tamañoFuente;

    private ConfiguracionInterfaz() {
        Idioma = "ES";
        tamañoFuente = 12;
    }
//El singleton
    public static ConfiguracionInterfaz getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionInterfaz();
        }
        return instancia;
    }
    public String getIdioma() {
        return this.Idioma;
    }
    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    public void setTamañoFuente(int tamañoFuente) {
        this.tamañoFuente = tamañoFuente;
    }
    public int getTamañoFuente() {
        return tamañoFuente;
    }

}
