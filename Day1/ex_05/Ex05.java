import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        return new ArrayList<>(Arrays.asList(var));
    }
}
