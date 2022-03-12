import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


public class example extends JFrame implements ActionListener {
    public JLabel lblOne;
    public JTextField txtOne;
    private JButton  btnReset, btnExit,btnçevir;
    private JMenuItem menuitem;



    public example() {


        setLayout(new GridLayout(0,2));


        btnReset= new JButton("Reset");
        btnExit= new JButton("Exit");
        btnçevir= new JButton("çevir");
        lblOne=new JLabel();

        txtOne= new JTextField();
        txtOne.setColumns(30);
        menuitem= new JMenuItem();

        txtOne.addActionListener (this);
        btnReset.addActionListener (this);
        btnExit.addActionListener (this);
        btnçevir.addActionListener (this);


        add(btnReset);
        add(btnExit);
        add(txtOne);
        add(lblOne);
        add(menuitem);
        //add(btnçevir);


        setSize(500, 400);
        setVisible(true);
        setTitle("ws4");
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);

    }
    public static void main (String[] args) {

        new example();


    }


    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
//if (e.getSource()==btnçevir)
        çevir();

        if(e.getSource()==btnReset)
            reset();
        else
            exit();
    }
    public void çevir() {
        //String a =txtOne.getText().toUpperCase();
        //String b
        //lblOne.setText(a);
        //lblOne.setOpaque(true);
        String str1=txtOne.getText();
        StringBuffer newStr=new StringBuffer(str1);

        for(int i = 0; i < str1.length(); i++) {

            //Checks for lower case character
            if(Character.isLowerCase(str1.charAt(i))) {
                //Convert it into upper case using toUpperCase() function
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));

            }
            //Checks for upper case character
            else if(Character.isUpperCase(str1.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));


            }
            String str = newStr.toString();
            lblOne.setText(str);
        }
    }


    public void exit() {
        System.exit(1);
    }
    //txtOne
    public void reset() {
        txtOne.setText("");
        lblOne.setText("");
    }

    public JTextField gettxtOne() {
        return txtOne;
    }
}