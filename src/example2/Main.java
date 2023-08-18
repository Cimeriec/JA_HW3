package example2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "Cp866"))) {
            bw.write("Hello World!!!");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader((new InputStreamReader((new FileInputStream(file)))))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
