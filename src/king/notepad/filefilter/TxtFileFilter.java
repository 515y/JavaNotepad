package king.notepad.filefilter;

// ������txt�ļ�
public class TxtFileFilter extends MyFileFilter {
	public TxtFileFilter(){
		super();
		this.addExtension("txt");
		this.addDescription("�ı��ĵ�(*.txt)");
	}
}
