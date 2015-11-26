package king.notepad.listselectionlistener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import king.notepad.service.TextService;
import king.notepad.view.FontDialog;

//�����С�б��
public class FontSizeListSelectionListener implements ListSelectionListener {
    private FontDialog dialog;
    
    public FontSizeListSelectionListener(FontDialog dialog) {
        this.dialog = dialog;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        TextService.setFontSizeListSelected(dialog);
    }

}
