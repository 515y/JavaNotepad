package king.notepad.listselectionlistener;

import java.awt.event.ItemListener;

import javax.swing.event.ListSelectionListener;

import king.notepad.view.FontDialog;

//��ȡJListѡ�������
public class ListSelectionListenerFactory {
    public static ListSelectionListener getListener(FontDialog dialog, String type){
        switch (type){
        case "����":
            return new FontListSelectionListener(dialog);
        case "����":
            return new FontStyleListSelectionListener(dialog);
        case "��С":
            return new FontSizeListSelectionListener(dialog);
        }
        return null;
    }

}
