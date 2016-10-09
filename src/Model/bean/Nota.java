package Model.bean;

public class Nota {

    protected int nota_id, matri_alu, id_disc;
    protected String bimestre, descricao;
    protected float valor;

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

    public int getMatri_alu() {
        return matri_alu;
    }

    public void setMatri_alu(int matri_alu) {
        this.matri_alu = matri_alu;
    }

    public int getId_disc() {
        return id_disc;
    }

    public void setId_disc(int id_disc) {
        this.id_disc = id_disc;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
