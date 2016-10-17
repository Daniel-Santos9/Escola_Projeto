package Model.bean;

public class Exemplar extends Livro {
    protected int exemplar_id;
    protected String tombamento;

    public int getExemplar_id() {
        return exemplar_id;
    }

    public void setExemplar_id(int exemplar_id) {
        this.exemplar_id = exemplar_id;
    }

    public String getTombamento() {
        return tombamento;
    }

    public void setTombamento(String tombamento) {
        this.tombamento = tombamento;
    }
    
    
}
