package pl.mikbac.java_8.FilesLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by MikBac on 20.10.2021
 */
public class FilesLines {

    public static final String PATH = "src/pl/mikbac/java_8/FilesLines/example.txt";

    public static void main(String[] args) {

        Path path = Paths.get(PATH);

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

}
