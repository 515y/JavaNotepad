package king.notepad.actionlistener.notepadframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.service.FileService;
import king.notepad.view.NotepadFrame;

public class SaveAction implements ActionListener {
	private NotepadFrame frame;
	
	public SaveAction(NotepadFrame frame){
		this.frame = frame;
	}
	
	//��ҵ���߼�����ȫת�Ƶ�Service
	@Override
	public void actionPerformed(ActionEvent e) {
		FileService.saveFileMenu(frame, FileService.SAVE);
	}

}
