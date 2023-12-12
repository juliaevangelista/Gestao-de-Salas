package eron_julia.gestao;

/**
 *
 * @author Eronilson e Julia
 */
public class Sala {
    String idSala, tipoSala, status;
    int bloco, numSala;

    private Instituto Ins;
    
    public Sala() {
    }

    public Sala(String idSala,int numSala, String tipoSala, int bloco) {
        this.idSala = idSala;
        this.numSala = numSala;
        this.tipoSala = tipoSala;
        this.bloco = bloco;
    }
 

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public Instituto getIns() {
        return Ins;
    }

    public void setIns(Instituto Ins) {
        this.Ins = Ins;
    }
    
    
    
}
