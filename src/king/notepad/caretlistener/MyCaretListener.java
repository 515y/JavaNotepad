package king.notepad.caretlistener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import king.notepad.service.TextService;
import king.notepad.view.NotepadFrame;

//�ı�λ��ʱ�����˼�����
public class MyCaretListener implements CaretListener {
    private NotepadFrame frame;
    
    public MyCaretListener(NotepadFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void caretUpdate(CaretEvent arg0) {
        frame.setStateLabel(TextService.getRow(frame), TextService.getColumn(frame));
    }

}
