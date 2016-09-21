package EP3;

/**
 *
 * @author douglasjtds
 */
public class Reporter {
    
    private String nomeCompletoReporter;
    private int idSequencial;

    
    public Reporter(int idSequencial, String nomeCompletoReporter) {
        this.idSequencial = idSequencial;
        this.nomeCompletoReporter = nomeCompletoReporter;
    }

  
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
    
}
