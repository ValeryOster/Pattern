package aufgaben.glava8.A168ExecuteAround;

import java.io.IOException;
import java.util.Scanner;

@FunctionalInterface
public interface ScannerDoubleFunction {
    double readDouble(Scanner scanner) throws IOException;
}
