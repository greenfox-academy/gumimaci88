import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path myFilePath = Paths.get(myfile.txt);
            List<String> lines = Files.readAllLines(myFilePath);
            for (String eachLineOfLines : lines) {
                System.out.println(eachLineOfLines);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
    }
}