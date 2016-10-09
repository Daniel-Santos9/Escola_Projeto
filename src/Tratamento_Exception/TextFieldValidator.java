
package Tratamento_Exception;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Bruno
 */
public class TextFieldValidator {
    
    private final String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private final String numregex = "[0-9]";
    
    public void maxLengthLimit(JTextField field, int length){
        String text = field.getText();
        if(!(text.length() < length)){
            field.setText(text.substring(0, (length-1)));
        }               
    }
    
    public boolean emailValidate(JTextField field){        
        return field.getText().matches(emailregex);
    }
    
    public void numericValidate(KeyEvent evt){  
        if(!(Character.isDigit(evt.getKeyChar()))
                || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE
                || evt.getKeyChar() == KeyEvent.VK_DELETE)
            evt.consume();
    }
}
