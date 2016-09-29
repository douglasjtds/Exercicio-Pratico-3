package EP3;

/**
 *
 * @author douglasjtds
 */
public class Reporter {
    
    private String nomeCompletoReporter;
    private int idSequencial;
    
    public int getIdSequencial() {
        return idSequencial;
    }

    public void setIdSequencial(int idSequencial) {
        this.idSequencial = idSequencial;
    }

    public String getNomeCompletoReporter() {
        return nomeCompletoReporter;
    }

    public void setNomeCompletoReporter(String nomeCompletoReporter) {
        this.nomeCompletoReporter = nomeCompletoReporter;
    }
 
    public Reporter(String nomeCompletoReporter, int idSequencial) {
        this.nomeCompletoReporter = nomeCompletoReporter;
        this.idSequencial = idSequencial;
    }
    
    public String imprimeReporter() {
        return "Nome do repórter: " + nomeCompletoReporter + "\n" +
               "ID: " + idSequencial + "\n";
    }
}
