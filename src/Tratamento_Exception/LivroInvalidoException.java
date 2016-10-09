package Tratamento_Exception;

public class LivroInvalidoException extends Exception{

    @Override
    public String getMessage() {
        return "Livro não encontrado. Crie-o";
    }
   
}
