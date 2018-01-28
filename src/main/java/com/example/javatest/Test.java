package com.example.javatest;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用随机文件流类 RandomAccessFile 将一个文本文件倒置读出
 */
public class Test {

    public static void main(String[] args) {

        try {
            File file = new File("f://test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < file.length(); i++) {
                raf.seek(file.length() - 1 - i);
                char c = (char) raf.read();
                sb.append(c);
            }
            raf.close();
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}














