package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class FileRead {


    public static void main(String[] args) {
        read();
    }


    static long read(){
        long size = 0;
        try {
            FileReader fr = new FileReader("/home/soumyajit/Documents/hi.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line.toUpperCase());
            }

            File f = new File("/home/soumyajit/Documents/hi.txt");
            size = f.length();
            System.out.println("Filesize in bytes: " + size);
        }
        catch(Exception e)
        { e.printStackTrace();

        }

        return size;
    }


}
