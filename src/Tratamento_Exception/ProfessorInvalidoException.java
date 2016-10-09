package Tratamento_Exception;

public class ProfessorInvalidoException extends Exception {

    @Override
    public String getMessage() {
        return "Professor não encontrado.Crie-o";
    }
    
}
