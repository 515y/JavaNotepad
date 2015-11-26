package king.notepad.actionlistener.notepadframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import king.notepad.view.NotepadFrame;

//���鿴-״̬�����˵�
public class ShowHideStateAction implements ActionListener {
	private NotepadFrame frame;
	
	public ShowHideStateAction(NotepadFrame frame){
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setStatePanelVisible(!frame.getStatePanelVisible());
	}
}
