package com.priv.io;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

public class ZipCompress {
    public static String file = "src/com/priv/io/test.zip";

    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream(file);
        CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);
        zos.setComment("A test of Java Zipping");
        for (String arg : args) {
            System.out.println("Writing file " + arg);
            BufferedReader in = new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c = in.read()) != -1)
                out.write(c);
            in.close();
            out.flush();
        }
        out.close();
        System.out.println("Checksum: " + csum.getChecksum().getValue());
        System.out.println("Reading file");
        FileInputStream fi = new FileInputStream(file);
        CheckedInputStream csumi =
                new CheckedInputStream(fi, new Adler32());
        ZipInputStream in2 = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(in2);
        ZipEntry ze;
        while ((ze = in2.getNextEntry()) != null) {
            System.out.println("Reading file " + ze);
            int x;
            while ((x = bis.read()) != -1)
                System.out.write(x);
        }
        if (args.length == 1)
            System.out.println("Checksum: " + csumi.getChecksum().getValue());
        bis.close();
        //����һ�ֶ�ȡZip��ʽ�ļ���·
        ZipFile zf = new ZipFile(file);
        Enumeration e = zf.entries();
        while (e.hasMoreElements()) {
            ZipEntry ze2 = (ZipEntry) e.nextElement();
            System.out.println("File: " + ze2);
        }
    }
}
