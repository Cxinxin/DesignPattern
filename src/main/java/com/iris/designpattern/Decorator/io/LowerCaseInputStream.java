package com.iris.designpattern.Decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c=super.read();
        return (c==-1?c:Character.toUpperCase((char)c));
    }

    @Override
    public int read(byte[] bytes, int offset, int len) throws IOException {
        int result=super.read(bytes,offset,len);
            for(int i=offset;i<offset+result;i++){
                bytes[i]= (byte) Character.toUpperCase((char)bytes[i]);
            }
            return result;

        }
}
