package zadanie4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Form {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextArea textArea1;
    private JPanel panel1;

    private void zakoduj(String standard){
        try {
            OutputStream outputStream = new FileOutputStream("D:\\5 semestr\\PwjJ\\Zadanie_4\\src\\textfiles\\" + standard + ".txt");
            Writer writer = new OutputStreamWriter(outputStream, standard);
            writer.write(textArea1.getText());
            writer.close();

        }catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public Form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zakoduj("UTF-8");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zakoduj("ISO-8859-2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zakoduj("Cp1250");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NewForm");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
