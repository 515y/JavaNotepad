package king.notepad.actionlistener.notepadframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.view.NotepadFrame;
import king.notepad.view.findreplacedialog.FindDialog;

//NotepadFrame�˵��еġ����ҡ����򿪲��ҶԻ���
public class FindAction implements ActionListener {
    private NotepadFrame frame;
    
    public FindAction(NotepadFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        new FindDialog(frame);
    }

}
