package Tratamento_Exception;

public class DisciplinaInvalidaException extends Exception{

    @Override
    public String getMessage() {
        return "Disciplina não encontrada.Crie-a";
    }
    
}
