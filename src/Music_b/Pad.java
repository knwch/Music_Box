package Music_b;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import net.miginfocom.swing.*;

public class Pad extends JFrame implements ActionListener, KeyListener, MouseListener{

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - satit
        defaultButton1 = new JButton();
        defaultButton2 = new JButton();
        userButton = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        slider1 = new JSlider();
        slider2 = new JSlider();
        button18 = new JButton();
        label2 = new JLabel();
        label1 = new JLabel();

        //======== this ========
        setMinimumSize(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- defaultButton1 ----
        defaultButton1.setIcon(new ImageIcon("E:\\Docs\\#2-1\\CSS222\\Music_Box\\src\\up_w.png"));
        defaultButton1.setBorderPainted(false);
        defaultButton1.setContentAreaFilled(false);
        contentPane.add(defaultButton1);
        defaultButton1.setBounds(150, 30, 100, defaultButton1.getPreferredSize().height);

        //---- defaultButton2 ----
        defaultButton2.setIcon(new ImageIcon("E:\\Docs\\#2-1\\CSS222\\Music_Box\\src\\down_w.png"));
        defaultButton2.setBorderPainted(false);
        defaultButton2.setContentAreaFilled(false);
        contentPane.add(defaultButton2);
        defaultButton2.setBounds(270, 30, 100, defaultButton2.getPreferredSize().height);

        //---- userButton ----
        userButton.setText("text");
        contentPane.add(userButton);
        userButton.setBounds(390, 70, 100, userButton.getPreferredSize().height);

        //---- button1 ----
        button1.setBorderPainted(false);
        button1.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button1.setAlignmentY(0.0F);
        button1.setMaximumSize(new Dimension(100, 100));
        button1.setMinimumSize(new Dimension(1000, 100));
        button1.setContentAreaFilled(false);
        contentPane.add(button1);
        button1.setBounds(150, 110, 100, 100);

        //---- button2 ----
        button2.setBorderPainted(false);
        button2.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button2.setAlignmentY(0.0F);
        button2.setMaximumSize(new Dimension(100, 100));
        button2.setMinimumSize(new Dimension(1000, 100));
        button2.setContentAreaFilled(false);
        contentPane.add(button2);
        button2.setBounds(270, 110, 100, 100);

        //---- button3 ----
        button3.setBorderPainted(false);
        button3.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button3.setAlignmentY(0.0F);
        button3.setMaximumSize(new Dimension(100, 100));
        button3.setMinimumSize(new Dimension(1000, 100));
        button3.setContentAreaFilled(false);
        contentPane.add(button3);
        button3.setBounds(390, 110, 100, 100);

        //---- button4 ----
        button4.setBorderPainted(false);
        button4.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button4.setAlignmentY(0.0F);
        button4.setMaximumSize(new Dimension(100, 100));
        button4.setMinimumSize(new Dimension(1000, 100));
        button4.setContentAreaFilled(false);
        contentPane.add(button4);
        button4.setBounds(510, 110, 100, 100);

        //---- button5 ----
        button5.setBorderPainted(false);
        button5.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button5.setAlignmentY(0.0F);
        button5.setMaximumSize(new Dimension(100, 100));
        button5.setMinimumSize(new Dimension(1000, 100));
        button5.setContentAreaFilled(false);
        contentPane.add(button5);
        button5.setBounds(150, 225, 100, 100);

        //---- button6 ----
        button6.setBorderPainted(false);
        button6.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button6.setAlignmentY(0.0F);
        button6.setMaximumSize(new Dimension(100, 100));
        button6.setMinimumSize(new Dimension(1000, 100));
        button6.setContentAreaFilled(false);
        contentPane.add(button6);
        button6.setBounds(270, 225, 100, 100);

        //---- button7 ----
        button7.setBorderPainted(false);
        button7.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button7.setAlignmentY(0.0F);
        button7.setMaximumSize(new Dimension(100, 100));
        button7.setMinimumSize(new Dimension(1000, 100));
        button7.setContentAreaFilled(false);
        contentPane.add(button7);
        button7.setBounds(390, 225, 100, 100);

        //---- button8 ----
        button8.setBorderPainted(false);
        button8.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button8.setAlignmentY(0.0F);
        button8.setMaximumSize(new Dimension(100, 100));
        button8.setMinimumSize(new Dimension(1000, 100));
        button8.setContentAreaFilled(false);
        contentPane.add(button8);
        button8.setBounds(510, 225, 100, 100);

        //---- button9 ----
        button9.setBorderPainted(false);
        button9.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button9.setAlignmentY(0.0F);
        button9.setMaximumSize(new Dimension(100, 100));
        button9.setMinimumSize(new Dimension(1000, 100));
        button9.setContentAreaFilled(false);
        contentPane.add(button9);
        button9.setBounds(150, 340, 100, 100);

        //---- button10 ----
        button10.setBorderPainted(false);
        button10.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button10.setAlignmentY(0.0F);
        button10.setMaximumSize(new Dimension(100, 100));
        button10.setMinimumSize(new Dimension(1000, 100));
        button10.setContentAreaFilled(false);
        contentPane.add(button10);
        button10.setBounds(270, 340, 100, 100);

        //---- button11 ----
        button11.setBorderPainted(false);
        button11.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button11.setAlignmentY(0.0F);
        button11.setMaximumSize(new Dimension(100, 100));
        button11.setMinimumSize(new Dimension(1000, 100));
        button11.setContentAreaFilled(false);
        contentPane.add(button11);
        button11.setBounds(390, 340, 100, 100);

        //---- button12 ----
        button12.setBorderPainted(false);
        button12.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button12.setAlignmentY(0.0F);
        button12.setMaximumSize(new Dimension(100, 100));
        button12.setMinimumSize(new Dimension(1000, 100));
        button12.setContentAreaFilled(false);
        contentPane.add(button12);
        button12.setBounds(510, 340, 100, 100);

        //---- button13 ----
        button13.setBorderPainted(false);
        button13.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button13.setAlignmentY(0.0F);
        button13.setMaximumSize(new Dimension(100, 100));
        button13.setMinimumSize(new Dimension(1000, 100));
        button13.setContentAreaFilled(false);
        contentPane.add(button13);
        button13.setBounds(150, 455, 100, 100);

        //---- button14 ----
        button14.setBorderPainted(false);
        button14.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button14.setAlignmentY(0.0F);
        button14.setMaximumSize(new Dimension(100, 100));
        button14.setMinimumSize(new Dimension(1000, 100));
        button14.setContentAreaFilled(false);
        contentPane.add(button14);
        button14.setBounds(270, 455, 100, 100);

        //---- button15 ----
        button15.setBorderPainted(false);
        button15.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button15.setAlignmentY(0.0F);
        button15.setMaximumSize(new Dimension(100, 100));
        button15.setMinimumSize(new Dimension(1000, 100));
        button15.setContentAreaFilled(false);
        contentPane.add(button15);
        button15.setBounds(390, 455, 100, 100);

        //---- button16 ----
        button16.setBorderPainted(false);
        button16.setIcon(new ImageIcon(getClass().getResource("/gray.png")));
        button16.setAlignmentY(0.0F);
        button16.setMaximumSize(new Dimension(100, 100));
        button16.setMinimumSize(new Dimension(1000, 100));
        button16.setContentAreaFilled(false);
        contentPane.add(button16);
        button16.setBounds(510, 455, 100, 100);

        //---- button17 ----
        button17.setText("text");
        contentPane.add(button17);
        button17.setBounds(510, 70, 100, button17.getPreferredSize().height);

        //---- slider1 ----
        slider1.setOrientation(SwingConstants.VERTICAL);
        slider1.setBorder(new CompoundBorder(
            new TitledBorder("Accent"),
            new EmptyBorder(5, 5, 5, 5)));
        contentPane.add(slider1);
        slider1.setBounds(75, 140, 55, 375);

        //---- slider2 ----
        slider2.setOrientation(SwingConstants.VERTICAL);
        slider2.setBorder(new CompoundBorder(
            new TitledBorder("Bpm"),
            new EmptyBorder(5, 5, 5, 5)));
        contentPane.add(slider2);
        slider2.setBounds(15, 140, 56, 375);

        //---- button18 ----
        button18.setText("Stop");
        contentPane.add(button18);
        button18.setBounds(15, 525, 115, button18.getPreferredSize().height);

        //---- label2 ----
        label2.setText("METRONOME");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(35, 110), label2.getPreferredSize()));

        //---- label1 ----
        label1.setIcon(new ImageIcon("E:\\Docs\\#2-1\\CSS222\\Music_Box\\src\\bg.png"));
        contentPane.add(label1);
        label1.setBounds(0, 0, 630, 570);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private int temp = 0;

    public Pad()
    {
        initComponents();
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        defaultButton1.addActionListener(this);
        defaultButton2.addActionListener(this);
        userButton.addActionListener(this);

        button1.addKeyListener(this);
        button2.addKeyListener(this);
        button3.addKeyListener(this);
        button4.addKeyListener(this);
        button5.addKeyListener(this);
        button6.addKeyListener(this);
        button7.addKeyListener(this);
        button8.addKeyListener(this);
        button9.addKeyListener(this);
        button10.addKeyListener(this);
        button11.addKeyListener(this);
        button12.addKeyListener(this);
        button13.addKeyListener(this);
        button14.addKeyListener(this);
        button15.addKeyListener(this);
        button16.addKeyListener(this);
        defaultButton1.addKeyListener(this);
        defaultButton2.addKeyListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1) { SoundFiles.defaultFile(temp, 1); }
        else if(e.getSource() == button2) { SoundFiles.defaultFile(temp, 2); }
        else if(e.getSource() == button3) { SoundFiles.defaultFile(temp, 3); }
        else if(e.getSource() == button4) { SoundFiles.defaultFile(temp, 4); }
        else if(e.getSource() == button5) { SoundFiles.defaultFile(temp, 5); }
        else if(e.getSource() == button6) { SoundFiles.defaultFile(temp, 6); }
        else if(e.getSource() == button7) { SoundFiles.defaultFile(temp, 7); }
        else if(e.getSource() == button8) { SoundFiles.defaultFile(temp, 8); }
        else if(e.getSource() == button9) { SoundFiles.defaultFile(temp, 9); }
        else if(e.getSource() == button10) { SoundFiles.defaultFile(temp, 10); }
        else if(e.getSource() == button11) { SoundFiles.defaultFile(temp, 11); }
        else if(e.getSource() == button12) { SoundFiles.defaultFile(temp, 12); }
        else if(e.getSource() == button13) { SoundFiles.defaultFile(temp, 13); }
        else if(e.getSource() == button14) { SoundFiles.defaultFile(temp, 14); }
        else if(e.getSource() == button15) { SoundFiles.defaultFile(temp, 15); }
        else if(e.getSource() == button16) { SoundFiles.defaultFile(temp, 16); }
        else if(e.getSource() == defaultButton1) { Sound.drop(); temp = 0; }
        else if(e.getSource() == defaultButton2) { Sound.drop(); temp = 1; }
        else if(e.getSource() == userButton) { Sound.drop(); temp = 3; }
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_1) { button1.requestFocus(); button1.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 1); }
        else if(e.getKeyCode() == KeyEvent.VK_2) { button2.requestFocus(); button2.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 2); }
        else if(e.getKeyCode() == KeyEvent.VK_3) { button3.requestFocus(); button3.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 3); }
        else if(e.getKeyCode() == KeyEvent.VK_4) { button4.requestFocus(); button4.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 4); }
        else if(e.getKeyCode() == KeyEvent.VK_Q) { button5.requestFocus(); button5.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 5); }
        else if(e.getKeyCode() == KeyEvent.VK_W) { button6.requestFocus(); button6.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 6); }
        else if(e.getKeyCode() == KeyEvent.VK_E) { button7.requestFocus(); button7.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 7); }
        else if(e.getKeyCode() == KeyEvent.VK_R) { button8.requestFocus(); button8.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 8); }
        else if(e.getKeyCode() == KeyEvent.VK_A) { button9.requestFocus(); button9.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 9); }
        else if(e.getKeyCode() == KeyEvent.VK_S) { button10.requestFocus(); button10.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 10); }
        else if(e.getKeyCode() == KeyEvent.VK_D) { button11.requestFocus(); button11.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 11); }
        else if(e.getKeyCode() == KeyEvent.VK_F) { button12.requestFocus(); button12.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 12); }
        else if(e.getKeyCode() == KeyEvent.VK_Z) { button13.requestFocus(); button13.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 13); }
        else if(e.getKeyCode() == KeyEvent.VK_X) { button14.requestFocus(); button14.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 14); }
        else if(e.getKeyCode() == KeyEvent.VK_C) { button15.requestFocus(); button15.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 15); }
        else if(e.getKeyCode() == KeyEvent.VK_V) { button16.requestFocus(); button16.setIcon(new ImageIcon(ChooseColor.randomColor())); SoundFiles.defaultFile(temp, 16); }
        else if(e.getKeyCode() == KeyEvent.VK_O) { defaultButton1.requestFocus(); defaultButton1.setIcon(new ImageIcon("src/up_g.png")); temp = 0; }
        else if(e.getKeyCode() == KeyEvent.VK_P) { defaultButton2.requestFocus(); defaultButton2.setIcon(new ImageIcon("src/down_g.png"));  temp = 1; }
    }

    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_1) { button1.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_2) { button2.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_3) { button3.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_4) { button4.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_Q) { button5.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_W) { button6.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_E) { button7.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_R) { button8.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_A) { button9.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_S) { button10.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_D) { button11.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_F) { button12.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_Z) { button13.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_X) { button14.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_C) { button15.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_V) { button16.setIcon(new ImageIcon("src/gray.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_O) { defaultButton1.setIcon(new ImageIcon("src/up_w.png")); }
        else if(e.getKeyCode() == KeyEvent.VK_P) { defaultButton2.setIcon(new ImageIcon("src/down_w.png")); }
    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void mouseClicked(MouseEvent e)
    {

    }

    public void mousePressed(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Pad().rootPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Music_Box");
        frame.setResizable(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - satit
    private JButton defaultButton1;
    private JButton defaultButton2;
    private JButton userButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JSlider slider1;
    private JSlider slider2;
    private JButton button18;
    private JLabel label2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}