package eron_julia.gestao;

import java.util.ArrayList;

/**
 *
 * @author Eronilson e Julia
 */
public class Instituto extends Sala{

    ArrayList<Sala> ListaSal;
    public Instituto() {
        ListaSal = new ArrayList();
        
    }

    public Instituto(String idSala, int numSala, String tipoSala, int bloco) {
        super(idSala, numSala, tipoSala, bloco);
        this.ListaSal = ListaSal;
    }
    

    public ArrayList<Sala> getListaSal() {
        return ListaSal;
    }

    public void setListaSal(ArrayList<Sala> ListaSal) {
        this.ListaSal = ListaSal;
    }
    
    public void addSal(Sala x){
        x.setIns(this);
        ListaSal.add(x);
    }
}
