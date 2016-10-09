package Tratamento_Exception;

public class ExemplarInvalidoException extends Exception{

    @Override
    public String getMessage() {
        return "Exemplar não encontrado. crie-o";
    }
    
}
