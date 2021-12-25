package module3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilesExamples {

    public static void main(String[] args) throws IOException {
        // read from file
        // Path.of("dir1", "dir2", "text.txt").toFile();
        Scanner in = new Scanner(new File("text.txt"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }

        List<String> names = Files.lines(Path.of("text.txt"))
                .collect(Collectors.toList());
        System.out.println(names);

        // write to File
        // 1. Files.write
        // 2. FileOutputStream (PrintWriter)

        try (PrintWriter printer = new PrintWriter("out.txt")) {
            printer.println("Hello world!");
        }

    }
}
