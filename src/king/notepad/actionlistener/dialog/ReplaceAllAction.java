package king.notepad.actionlistener.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.service.TextService;
import king.notepad.view.findreplacedialog.MyDialog;

// �����滻�Ի����滻ȫ������ť
public class ReplaceAllAction implements ActionListener {
    private MyDialog dialog;
    
    public ReplaceAllAction(MyDialog dialog){
        this.dialog = dialog;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        TextService.replaceAll(dialog);
    }

}
