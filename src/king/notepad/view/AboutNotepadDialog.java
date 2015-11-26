package king.notepad.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import king.notepad.actionlistener.ActionListenerFactory;

//�����ڼ��±���
public class AboutNotepadDialog extends JDialog {
    
    public AboutNotepadDialog(NotepadFrame frame){
        super(frame, "���� \"Java���±�\"");
        add(createTitle(), BorderLayout.NORTH);
        add(createMainBody());
        add(createEnterButton(), BorderLayout.SOUTH);
        //���öԻ�����Frame����
        int frameX = (int)frame.getBounds().getX();
        int frameY = (int)frame.getBounds().getY();
        setBounds(frameX+80, frameY+150, 0, 0);
        pack();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }
   

    
    //ȷ����ť
    private JPanel createEnterButton(){
        JButton button = new JButton("ȷ��");
        button.addActionListener(ActionListenerFactory.getActionListener(this, "ȷ��"));
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(button);
        return panel;
    }
    
    //����
    private JPanel createMainBody(){
        String text = "<html><body>" 
                + "���ߣ��������" + "<br>" 
                + "���䣺jwgmail@126.com" + "<br>" 
                + "�������ͣ�http://blog.csdn.net/kinglearnjava" + "<br>" 
                + "����ͣ�http://blog.sina.com.cn/king881204" + "<br>" 
                + "�汾��0.1 beta" + "<br>" 
                + "<br>" 
                + "���ܸ�����־��" + "<br>" 
                + "��2014/12/28 " + " ʵ�� Win 8.1 ���±� " + "<br>" 
                + "<body></html>"; 
        JLabel label = new JLabel(text);
        label.setFont(new Font("΢���ź�", Font.PLAIN, 13));
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 40, 10));
        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBorder(BorderFactory.createEtchedBorder());
        return panel;
    }
   
    // ������
    private JPanel createTitle(){
        JLabel label = new JLabel("Java���±�");
        label.setFont(new Font("΢���ź�", Font.BOLD, 30));
        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        return panel;
    }
}
