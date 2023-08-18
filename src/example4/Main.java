package example4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\1\\JA_HW3\\src\\example2\\text.txt");
        try {
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("This is the text for task #4");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
