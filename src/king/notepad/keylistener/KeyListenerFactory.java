package king.notepad.keylistener;

import java.awt.event.KeyListener;

//���������
public class KeyListenerFactory {
    public static KeyListener getKeyListener (String type){
        switch (type){
        case "����������":
            return new OnlyNumKeyListener();
        }
        return null;
    }
}
