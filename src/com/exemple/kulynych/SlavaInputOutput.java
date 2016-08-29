package com.exemple.kulynych;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class SlavaInputOutput {

    private String pathIn;
    private String pathOut;
    private FileInputStream in = null;
    private FileOutputStream out = null;

    public SlavaInputOutput(String pathIn, String pathOut) {
        this.pathIn = pathIn;
        this.pathOut = pathOut;
    }

    public void copyFile() throws IOException {
        try {
            in = new FileInputStream(pathIn);
            out = new FileOutputStream(pathOut);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
}
