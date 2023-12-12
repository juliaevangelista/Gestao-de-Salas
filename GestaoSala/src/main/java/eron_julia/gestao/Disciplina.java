package eron_julia.gestao;

/**
 *
 * @author Eronilson e Julia
 */
public class Disciplina extends Sala{
    String nomeDisciplina, codDisciplina, curso, professor, diaSemana, horario;
    int CargaHorariaSemanal;
    String turno;
    
    private Materia Mat;

    public Disciplina() {
    }

    public Disciplina(String nomeDisciplina, String codDisciplina, String curso,
                      String professor, String diaSemana, String horario, 
                      int CargaHorariaSemanal, String turno) {
        this.nomeDisciplina = nomeDisciplina;
        this.codDisciplina = codDisciplina;
        this.curso = curso;
        this.professor = professor;
        this.diaSemana = diaSemana;
        this.horario = horario;
        this.CargaHorariaSemanal = CargaHorariaSemanal;
        this.turno = turno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCargaHorariaSemanal() {
        return CargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int CargaHorariaSemanal) {
        this.CargaHorariaSemanal = CargaHorariaSemanal;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Materia getMat() {
        return Mat;
    }

    public void setMat(Materia Mat) {
        this.Mat = Mat;
    }
    
    
}
