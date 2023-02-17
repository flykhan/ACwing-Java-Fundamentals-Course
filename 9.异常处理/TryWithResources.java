import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String line;
        try (
                // BufferedReader 可以读信息, FileReader 可以用来从文件读信息
                BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/output.txt"));) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line => " + line);
                bw.write("Copy: " + line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}