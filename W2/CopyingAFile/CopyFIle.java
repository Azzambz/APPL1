import java.io.*;
import java.util.Scanner;

public class CopyFile {
    Scanner scan = new Scanner(System.in);

    public static void copying() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nama file yang akan di copy: ");
        String namafile = scan.nextLine();
        
        //sc : https://stackoverflow.com/questions/30021154/how-to-copy-a-text-file-and-print-out-the-original-and-copied-file-in-java
        //edit : input nama file dan looping ketika error
        try (BufferedReader br = new BufferedReader(new FileReader(namafile))) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Copied.txt"))) {
                String text = null;
                while ((text = br.readLine()) != null) {
                    System.out.println(text);
                    bw.write(text);
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            copying();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            copying();
        }
    }

    public static void main(String [] args) {
        copying();
        System.out.println("copy file berhasil.");
    }
}

