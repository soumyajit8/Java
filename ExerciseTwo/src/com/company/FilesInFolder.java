package com.company;

import java.io.*;

public class FilesInFolder {

    public static void main(String[] args) {
        findFile();
        read();
    }

    static String findFile() {

        String str = null;
        File file = new File("/home/soumyajit/Documents");
        File[] files = file.listFiles(new FilenameFilter() {


            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt"))
                    return true;
                else
                    return false;

            }
        });
        for(File f:files){
            str=f.getName();
            System.out.println(f.getName());
        }
        return str;
    }
    static String read() {

        String strr = null;
        String fileName = "/home/soumyajit/Documents/hi.txt";
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            byte content[] = new byte[2*1024];
            int readCount = 0;
            while((readCount = is.read(content)) > 0){
                strr=new String(content, 0, readCount-1);
                System.out.println(strr);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return strr;
    }
}
