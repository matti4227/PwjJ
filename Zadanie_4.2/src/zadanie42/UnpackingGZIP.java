package zadanie42;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class UnpackingGZIP {

    private String file;
    private String newFile;

    UnpackingGZIP(String sourcePath, String destPath){
        file = sourcePath;
        newFile = destPath;
    }

    public void writeUncompressed() throws IOException {


        InputStream gzip = rozpakuj();
        FileOutputStream fos = new FileOutputStream(newFile);

        byte[] buffer = new byte[1024];
        int len = 0;

        while((len = gzip.read(buffer)) > 0){
            fos.write(buffer, 0, len);
        }

        gzip.close();
        fos.close();
    }

    public InputStream rozpakuj(){

        try {
            InputStream input = new FileInputStream(file);

            if(file.toLowerCase().endsWith(".gz"))
                return new GZIPInputStream(input);

            return input;
        } catch (IOException e) {
            System.err.println("Couldn't unpack " + file);
            e.printStackTrace();

            return null;
        }
    }
}
