package com.priv.interfaces;
import java.util.*;
import java.nio.*;

public class AdaptedRandomDouble extends RandomDouble implements Readable {
    private int count;
    public AdaptedRandomDouble(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDouble(7));
        while(s.hasNext())
            System.out.print(s.next() + " ");
    }
}
