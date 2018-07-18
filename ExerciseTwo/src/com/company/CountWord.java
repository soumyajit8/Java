package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {


    public static void main(String[] args) {
        output();
    }


    public static String output() {
        Map<String, Integer> words = new HashMap<String, Integer>();
        try {
            countEachWords("/home/soumyajit/Documents/hi.txt", words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        System.out.println(words);

        String str = ""+words;
        System.out.println(str);
        return str;


    }

    static void countEachWords(String filename, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File(filename));

        while (file.hasNext()) {

            String word = file.next();
            Integer count = words.get(word);
            if (count != null)
                count++;
            else
                count = 1;
            words.put(word, count);

        }

        file.close();

    }
}
