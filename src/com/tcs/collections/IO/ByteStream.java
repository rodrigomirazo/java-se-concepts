package com.tcs.collections.IO;

import java.io.*;

public class ByteStream {

    public static void main(String args[]) throws IOException {

        FileInputStream in = new FileInputStream("/Users/rodrigomirazo/IdeaProjects/java-se-concepts/src/com/tcs/collections/IO/input.txt");
        FileOutputStream out = new FileOutputStream("/Users/rodrigomirazo/IdeaProjects/java-se-concepts/src/com/tcs/collections/IO/output.txt");
        // stream: Hola Nicholas
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
    }


}

class IODisplay {
    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}

class IOCreateFile {
    public static void main(String args[]) {

        try {
            byte bWrite [] = {1,2,3,4,5};
            OutputStream os = new FileOutputStream("/Users/rodrigomirazo/IdeaProjects/java-se-concepts/src/com/tcs/collections/IO/test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( x );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("/Users/rodrigomirazo/IdeaProjects/java-se-concepts/src/com/tcs/collections/IO/test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

class dirNavigation {

    public static void main(String args[]) {
        String dirname = "/Users/rodrigomirazo/IdeaProjects/java-se-concepts/src/com/tcs/collections/IO/CREATED";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();

        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("/Users/rodrigomirazo/IdeaProjects/java-se-concepts/src/com/tcs/collections/IO/");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}