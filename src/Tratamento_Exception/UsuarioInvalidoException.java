package Tratamento_Exception;

public class UsuarioInvalidoException extends Exception{
      @Override
    public String getMessage() {
        return "Usuário não encontrado. Crie-o";
    }  
}
