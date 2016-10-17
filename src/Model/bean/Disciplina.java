package Model.bean;

public class Disciplina {
    protected int disc_id;
    protected String nome, descricao, aula_sem;

    public int getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(int disc_id) {
        this.disc_id = disc_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAula_sem() {
        return aula_sem;
    }

    public void setAula_sem(String aula_sem) {
        this.aula_sem = aula_sem;
    }
    
    @Override
    
    public String toString(){
        return ""+this.nome;
    }  
    
}
