package Tratamento_Exception;

public class PaisInvalidoException extends Exception{

    @Override
    public String getMessage() {
        return "Pais não encontrada.Crie-os";
    }
    
}
