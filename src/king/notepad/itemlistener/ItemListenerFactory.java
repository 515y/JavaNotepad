package king.notepad.itemlistener;

import java.awt.event.ItemListener;

import king.notepad.view.FontDialog;

//����Ի��򣬽ű������б��¼�����������
public class ItemListenerFactory {
    public static ItemListener getListener(FontDialog dialog, String type){
        switch (type){
        case "�ű�":
            return new ScenarioItemListener(dialog);
        }
        return null;
    }

}
