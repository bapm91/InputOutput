package com.exemple.kulynych;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlavaTestRegExp {

    private static boolean test(String testString, String mask){
        Pattern p = Pattern.compile(mask);
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    private static boolean testMask(String testString){
        Pattern p = Pattern.compile("((\\w?)*(\\*?)*(\\ ?)*(\\.?)*)*");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static List<String> matchFiles(String mask, String path) throws IOException {
        if (!testMask(mask)) {
            throw new IOException("Sorry! I can not read this symbol =( ");
        }
        File file = new File(path);
        List<String> files = new ArrayList<>();
        for (String name : file.list()) {
            if (test(name, mask)){
                files.add(name);
            }
        }
        return files;
    }

    public static void main (String[] args) throws IOException {
        List<String> list = matchFiles(args[0], args[1]);
        for (String s : list){
            System.out.println(s);
        }
    }
}