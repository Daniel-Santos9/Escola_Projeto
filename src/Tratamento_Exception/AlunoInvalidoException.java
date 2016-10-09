package Tratamento_Exception;

public class AlunoInvalidoException extends Exception{

    @Override
    public String getMessage() {
        return "Aluno não encontrado. Crie-o";
    }
    
}
