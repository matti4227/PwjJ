package zadanie1;

import javax.swing.*;

import java.math.BigInteger;

import static javax.swing.JOptionPane.showInputDialog;

public class Dialog {

    private boolean checkNumber(String input){
        boolean flag = true;
        int i = 0;

        while(i < input.length() && flag == true){
            flag = false;
            for(int j = 48; j <= 57; j++) {
                if ((int) input.charAt(i) == j) {
                    flag = true;
                }
            }
            if(flag == false)
                return false;
            i++;
        }
        return true;
    }

    public void smallToBig(){
        String input = showInputDialog(null, "Podaj łańcuch znaków, zamienię wszystkie litery na duże");
        String output = input.toUpperCase();
        JOptionPane.showMessageDialog(null, output);
    }

    public void factorial(){
        String input = showInputDialog(null, "Podaj liczbę nieujemną, obliczę Ci silnię");

        if(checkNumber(input) == false){
            JOptionPane.showMessageDialog(null, "Prosiłem. O. Liczbę. Nieujemną.");
        }else{
            BigInteger bi = new BigInteger(input);
            BigInteger result = BigInteger.ONE;

            while(!bi.equals(BigInteger.ZERO)){
                result = result.multiply(bi);
                bi = bi.subtract(BigInteger.ONE);
            }

            JOptionPane.showMessageDialog(null, result);
        }
    }

    public void addition(){
        String input = showInputDialog(null, "Podaj liczbę n (nieujemną), zsumuję liczby nieparzyste mniejsze od n dla nieujemnych");

        if(checkNumber(input) == false){
            JOptionPane.showMessageDialog(null, "Prosiłem. O. Liczbę. Nieujemną.");
        }else{
            int n = Integer.parseInt(input);

            int counter = 1;
            int result = 0;

            while(counter <= n){
                result+=counter;
                counter+=2;
            }

            JOptionPane.showMessageDialog(null, result);
        }
    }

    public void binaryRepresentation(){
        String input = showInputDialog(null, "Podaj liczbę nieujemną, ja pokażę Ci jej reprezentację binarną");

        if(checkNumber(input) == false){
            JOptionPane.showMessageDialog(null, "Prosiłem. O. Liczbę. Nieujemną.");
        }else{
            int number = Integer.parseInt(input);

            if(number == 0){
                JOptionPane.showMessageDialog(null, 0);
            }else{
                int newNumber[] = new int[31];
                int i = 0;

                while(number > 0){
                    newNumber[i] = number%2;
                    i++;
                    number/=2;
                }

                String result = new String("");

                for(int j = i-1; j >= 0; j--) {
                    result += String.valueOf(newNumber[j]);
                }

                JOptionPane.showMessageDialog(null, result);
            }


        }
    }

    public void octalRepresentation(){
        String input = showInputDialog(null, "Podaj liczbę nieujemną, ja pokażę Ci jej reprezentację ósemkową");

        if(checkNumber(input) == false){
            JOptionPane.showMessageDialog(null, "Prosiłem. O. Liczbę. Nieujemną.");
        }else{
            int number = Integer.parseInt(input);

            if(number == 0){
                JOptionPane.showMessageDialog(null, 0);
            }else{
                int newNumber[] = new int[31];
                int i = 0;

                while(number > 0){
                    newNumber[i] = number%8;
                    i++;
                    number/=8;
                }

                String result = new String("");

                for(int j = i-1; j >= 0; j--) {
                    result += String.valueOf(newNumber[j]);
                }
                JOptionPane.showMessageDialog(null, result);
            }
        }
    }

    public void hexadecimalRepresentation(){
        String input = showInputDialog(null, "Podaj liczbę nieujemną, ja pokażę Ci jej reprezentację szesnastkową");

        if(checkNumber(input) == false){
            JOptionPane.showMessageDialog(null, "Prosiłem. O. Liczbę. Nieujemną.");
        }else{
            int number = Integer.parseInt(input);

            if(number == 0){
                JOptionPane.showMessageDialog(null, 0);
            }else{
                String newNumber[] = new String[31];
                int i = 0;
                String digits = "0123456789ABCDEF";

                while(number > 0){
                    newNumber[i] = String.valueOf(digits.charAt(number%16));
                    i++;
                    number/=16;
                }

                String result = new String("");

                for(int j = i-1; j >= 0; j--) {
                    result += String.valueOf(newNumber[j]);
                }

                JOptionPane.showMessageDialog(null, result);
            }
        }
    }

}
