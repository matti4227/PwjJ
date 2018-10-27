package zadanie6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zamieniacz extends Thread {

    JTextArea okno;
    volatile boolean zakonczyc;

    public Zamieniacz(JTextArea comp) {
        okno = comp;
        zakonczyc = false;
    }

    public void run() {

        while(!zakonczyc) {
            try {
                String tekst = okno.getText();
                int indeks = tekst.indexOf("{");

                if (indeks >= 0) {
                    okno.replaceRange("begin", indeks,indeks+1);
                    okno.setCaretPosition(tekst.length()+4);
                }else {
                    indeks = tekst.indexOf("}");
                    if (indeks >=0) {
                        okno.replaceRange("end", indeks,indeks+1);
                        okno.setCaretPosition(tekst.length()+2);
                    }
                }

                sleep(2000);

            }catch(Exception e) {}
        }
    }
}

class Sprawdzacz extends Thread {

    JTextArea okno;
    volatile boolean zakonczyc;

    public Sprawdzacz(JTextArea comp) {
        okno = comp;
        zakonczyc = false;
    }

    public void run() {

        int i = 0;

        while(!zakonczyc) {
            try {

                String tekst = okno.getText();
                int indeks = tekst.indexOf("cholera");

                if (indeks >= 0) {
                    JOptionPane.showMessageDialog(null, "ejejejejej, bez takich mi tu");
                    okno.replaceRange("tak się bawić nie będziemy", indeks,indeks+7);
                    okno.setCaretPosition(tekst.length()+19);
                    indeks = -1;
                }
                sleep(10000);

            }catch(Exception e) {}
        }
    }
}

public class NewJFrame extends JFrame {

    public NewJFrame() {

        initComponents();
        setSize(350,250);
        watek1 = new Zamieniacz(jTextArea1);
        watek1.start();
        watek2 = new Sprawdzacz(jTextArea1);
        watek2.start();
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setPreferredSize(new Dimension(300,200));
        jScrollPane1.setViewportView(jTextArea1);
        getContentPane().add(jScrollPane1, BorderLayout.CENTER);
        pack();
    }

    private void formWindowClosing(WindowEvent evt) {
        watek1.zakonczyc = true;
        watek1 = null;
        watek2.zakonczyc = true;
        watek2 = null;
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private Zamieniacz watek1;
    private Sprawdzacz watek2;
}
