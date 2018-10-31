package zadanie42;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class CompressingGZIP {

    private String file;
    private String newFile;

    public CompressingGZIP(String sourcePath, String destPath) {
        file = sourcePath;
        newFile = destPath;
    }

    void writeCompressed() throws IOException {

        OutputStream gzip = zapakuj();
        FileInputStream fin = new FileInputStream(file);

        byte[] buffer = new byte[1024];
        int len = 0;

        while ((len = fin.read(buffer)) > 0)
            gzip.write(buffer, 0, len);

        fin.close();
        gzip.close();
    }

    public OutputStream zapakuj(){

        try {
            OutputStream output = new FileOutputStream(newFile);
            return new GZIPOutputStream(output);

        } catch (IOException e) {
            System.err.println("Couldn't compress " + newFile);
            e.printStackTrace();

            return null;
        }
    }
}
