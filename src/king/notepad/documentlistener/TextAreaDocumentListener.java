package king.notepad.documentlistener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import king.notepad.service.TextService;
import king.notepad.view.NotepadFrame;

/**
 * �Զ���ʵ��Document������
 * �ĵ����ݸı�ʱ�����˼�����������δ����ĸ��ı����Ϊtrue������������
 * ��������״̬�����漰�ı����ļ��Ĳ������ʲ��Ƶ�service���С�
 */
public class TextAreaDocumentListener implements DocumentListener {
    private NotepadFrame frame;
    
    //������
    public TextAreaDocumentListener(NotepadFrame frame){
        this.frame = frame;
    }
    
    //����δ������Ϊ�棬�������ݴ��볷��ջ
    private void whenTextAreaChange(){
        frame.setHasChangedNoSave(true);
        TextService.pushTextArea(frame);
    }
    
    @Override
    public void changedUpdate(DocumentEvent e) {
        whenTextAreaChange();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        whenTextAreaChange();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        whenTextAreaChange();
    }

}
