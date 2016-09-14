package com.exemple.kulynych;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SlavaTestIO {

    private static void copyFile(String pathIn, String pathOut) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(pathIn);
            out = new FileOutputStream(pathOut);

            byte[] c = new byte[4096];
            int readCount;
            while ((readCount = in.read(c)) != -1) {
                out.write(c, 0, readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copyFile(args[0], args[1]);
    }
}
