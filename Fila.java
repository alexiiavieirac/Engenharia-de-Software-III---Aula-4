public class Fila {
    private static volatile Fila instance;

    public static Fila getInstance() {
        if(instance == null) {
            synchronized (Fila.class) {
                instance = new Fila();
            }
        }
        return instance;
    }

    public void adicionarDocumento(String documento) {
        // Add novo documento
    }

    public String imprimirProximoDocumenyo() {
        return "Documento Impresso";    
    }
}
