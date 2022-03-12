import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class key extends example implements KeyListener{



    public key() {
        gettxtOne().addKeyListener(this);
        lblOne.addKeyListener(this);
    }


    public static void main(String[] args) {
        new key();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        String str=txtOne.getText();
        lblOne.setText(str);
		 çevir();
    }

}