package eron_julia.gestao;

import java.util.ArrayList;

/**
 *
 * @author Eronilson e Julia
 */
public class Materia extends Disciplina{
    ArrayList<Sala> ListaDisc;

    public Materia(ArrayList<Sala> ListaDisc) {
        this.ListaDisc = ListaDisc;
    }

    public Materia(String nomeDisciplina, String codDisciplina, String curso, String professor, String diaSemana, String horario, int CargaHorariaSemanal, String turno) {
        super(nomeDisciplina, codDisciplina, curso, professor, diaSemana, horario, CargaHorariaSemanal, turno);
        this.ListaDisc = ListaDisc;
    }

    public ArrayList<Sala> getListaDisc() {
        return ListaDisc;
    }

    public void setListaDisc(ArrayList<Sala> ListaDisc) {
        this.ListaDisc = ListaDisc;
    }
    
    public void addDisc(Disciplina x){
        x.setMat(this);
        ListaDisc.add(x);
    }
    
}
