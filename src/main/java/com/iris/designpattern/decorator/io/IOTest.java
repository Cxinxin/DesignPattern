package com.iris.designpattern.decorator.io;


import java.io.*;
import java.net.URL;

public class IOTest {
    public static void main(String args[]){

        int c;
        try {
            InputStream inputStream=new IOTest().getFile();
            while ((c=inputStream.read())>0){
                System.out.print((char)c);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public InputStream getFile() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        /**
         getResource()方法会去classpath下找这个文件，获取到url resource, 得到这个资源后，调用url.getFile获取到 文件 的绝对路径
         */
        URL url = classLoader.getResource("hello.txt");
        /**
         * url.getFile() 得到这个文件的绝对路径
         */
        System.out.println(url.getFile());

          InputStream inputStream=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream((url.getFile()))));

        return inputStream;
    }

}
