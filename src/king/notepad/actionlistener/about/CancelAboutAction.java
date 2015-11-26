package king.notepad.actionlistener.about;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.view.AboutNotepadDialog;

//�����ڡ��˵��еġ�ȷ������ť
public class CancelAboutAction implements ActionListener {
    private AboutNotepadDialog dialog;
    
    public CancelAboutAction(AboutNotepadDialog dialog){
        this.dialog = dialog;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.dispose();
    }

}