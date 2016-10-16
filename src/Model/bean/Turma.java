package Model.bean;

public class Turma {
    protected int turma_id, id_disc;
    protected String serie, turno, sala,ano,disc_nome;

    public int getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(int turma_id) {
        this.turma_id = turma_id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    //Essa variável é usada apenas para listar as disciplinas
    // que os professores logados lecionam naquela turma

    public String getDisc_nome() {
        return disc_nome;
    }

    public void setDisc_nome(String disc_nome) {
        this.disc_nome = disc_nome;
    } 

    public int getId_disc() {
        return id_disc;
    }

    public void setId_disc(int id_disc) {
        this.id_disc = id_disc;
    }
    
    
}
