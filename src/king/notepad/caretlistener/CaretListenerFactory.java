package king.notepad.caretlistener;

import javax.swing.event.CaretListener;

import king.notepad.view.NotepadFrame;

// ������¼�������
public class CaretListenerFactory {
    public static CaretListener getCaretListener(NotepadFrame frame){
        return new MyCaretListener(frame);
    }
}
