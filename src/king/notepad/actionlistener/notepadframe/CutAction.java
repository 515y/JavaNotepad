package king.notepad.actionlistener.notepadframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.service.TextService;
import king.notepad.view.NotepadFrame;

public class CutAction implements ActionListener {
	private NotepadFrame frame;
	
	public CutAction(NotepadFrame frame){
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//�����ı�����صķ������м���
		TextService.cut(frame);
	}

}
