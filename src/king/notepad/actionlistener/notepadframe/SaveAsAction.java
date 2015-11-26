package king.notepad.actionlistener.notepadframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.service.FileService;
import king.notepad.view.NotepadFrame;

//�����Ϊ���˵�
public class SaveAsAction implements ActionListener {
	private NotepadFrame frame;
	
	public SaveAsAction(NotepadFrame frame){
		this.frame = frame;
	}

	//��ҵ���߼�����ȫת�Ƶ�service
	@Override
	public void actionPerformed(ActionEvent e) {
		FileService.saveFileMenu(frame, FileService.SAVE_AS);
	}

}
