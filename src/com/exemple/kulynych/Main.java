package com.exemple.kulynych;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    private static void copyFile(String pathIn, String pathOut) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(pathIn);
            out = new FileOutputStream(pathOut);

            byte[] c = new byte[4096];
            while ((in.read(c)) != -1) {
                out.write(c);
                c = new byte[4096];
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
        Main.copyFile(args[0], args[1]);
    }
}
