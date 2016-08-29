package com.exemple.kulynych;

import java.io.IOException;

public class Main {
    private static SlavaInputOutput streamExam;

    private static String PATH_IN = "C:/Execom/ProgrammForMe/test.txt";
    private static String PATH_OUT = "C:/Execom/ProgrammForMe/data.txt";

    public static void main(String[] args) throws IOException {
        PATH_IN = args[0];
        PATH_OUT = args[1];
        streamExam = new SlavaInputOutput(PATH_IN, PATH_OUT);

        streamExam.copyFile();
    }
}
