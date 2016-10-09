package Tratamento_Exception;

public class TurmaInvalidaException extends Exception {

    @Override
    public String getMessage() {
        return "Turma não encontrada. Crie-a";
    }
    
    
}
