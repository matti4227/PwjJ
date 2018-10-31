package zadanie7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

public class Main {

    static void minutesFrom1stJan1900(int thirtytwo){

        System.out.println(thirtytwo);

        byte []bytes = ByteBuffer.allocate(8).putInt(thirtytwo).array();

        System.out.println(bytes);

        long value =
                ((long)(bytes[7] & 0xff) << 56) |
                        ((long)(bytes[6] & 0xff) << 48) |
                        ((long)(bytes[5] & 0xff) << 40) |
                        ((long)(bytes[4] & 0xff) << 32) |
                        ((long)(bytes[3] & 0xff) << 24) |
                        ((long)(bytes[2] & 0xff) << 16) |
                        ((long)(bytes[1] & 0xff) << 8) |
                        ((long)(bytes[0] & 0xff));

        System.out.println(value);
    }

    public static void main(String[] args) throws IOException {

//        String nazwahosta;
//
//        if(args.length > 0) {
//            nazwahosta = args[0];
//        }else {
//            nazwahosta = "time-b.nist.gov";
//        }
//
//        try {
//            Socket gniazdo = new Socket(nazwahosta, 37);
//            InputStream strumien = gniazdo.getInputStream();
////            BufferedReader bufor = new BufferedReader(new InputStreamReader(strumien));
////            String wiersz = "";
////
////            while(wiersz != null) {
////                System.out.println(wiersz);
////                wiersz = bufor.readLine();
////            }
//
//        int thirtytwo = strumien.read();
//        minutesFrom1stJan1900(thirtytwo);
//
//        }catch(UnknownHostException e) {
//            System.err.println(e);
//        }catch(IOException e) {
//            System.err.println(e);
//        }


        ServerSocket server;

        try {

            server = new ServerSocket(9696);

            while (true) {

                Socket polaczenie = server.accept();
                Thread t = new Thread(new Gracz(polaczenie));
                t.start();
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
