package com.exemple.kulynych;

import java.util.List;

public class SlavaTestRegExpTest {
    @org.junit.Test
    public void main() throws Exception {
        SlavaTestRegExp mask = new SlavaTestRegExp();
        List<String> list = mask.matchFiles("Jolki2.mkv", "C:/Users/User/Downloads");
        if (list.size() == 1) {
            System.out.println("Found " + list.size() + " file.");
        } else if (list.size() == 0) {
            System.out.println("Don't found any files with this name.");
        } else {
            System.out.println("Found " + list.size() + " files.");
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}