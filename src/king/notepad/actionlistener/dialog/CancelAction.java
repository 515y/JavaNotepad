package king.notepad.actionlistener.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.view.findreplacedialog.MyDialog;

//�����ҡ��Ի����еġ�ȡ������ť
public class CancelAction implements ActionListener {
    private MyDialog dialog;
    
    public CancelAction(MyDialog dialog){
        this.dialog = dialog;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        dialog.dispose();
    }

}
