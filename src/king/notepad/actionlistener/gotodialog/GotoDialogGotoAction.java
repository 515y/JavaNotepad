package king.notepad.actionlistener.gotodialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.service.TextService;
import king.notepad.view.GotoDialog;

//ת��ָ���жԻ��򣬡�ת������ť
public class GotoDialogGotoAction implements ActionListener {
    private GotoDialog dialog;
    
    public GotoDialogGotoAction(GotoDialog dialog){
        this.dialog = dialog;
    }
        
    @Override
    public void actionPerformed(ActionEvent arg0) {
        TextService.gotoLine(dialog);
    }

}
