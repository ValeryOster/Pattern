package aufgaben.glava8.A168ExecuteAround;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Double {
    public static double read(ScannerDoubleFunction snf) throws IOException {
        try (Scanner scanner = new Scanner(Paths.get("doubles.txt"), String.valueOf(StandardCharsets.UTF_8))) {
            return snf.readDouble(scanner);
        }
    }
}
