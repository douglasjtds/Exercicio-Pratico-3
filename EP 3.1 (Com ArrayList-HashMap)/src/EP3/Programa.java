package EP3;

/**
 *
 * @author douglasjtds
 */
public class Programa {
    
    private String nomeDoPrograma;
    private int idSequencial;

    
    
    public int getIdSequencial() {
        return idSequencial;
    }

    public void setIdSequencial(int idSequencial) {
        this.idSequencial = idSequencial;
    }

    public String getNomeDoPrograma() {
        return nomeDoPrograma;
    }

    public void setNomeDoPrograma(String nomeDoPrograma) {
        this.nomeDoPrograma = nomeDoPrograma;
    }
    
    public Programa(String nomeDoPrograma, int idSequencial) {
        this.nomeDoPrograma = nomeDoPrograma;
        this.idSequencial = idSequencial;
    }

    
    
    public String imprimeProgramas() {
        return "Nome do repórter: " + nomeDoPrograma + "\n" +
               "ID: " + idSequencial + "\n";
    }
}
