import java.util.Arrays;

public class IndexOf {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d"};

        int getIndex = Arrays.asList(array1).indexOf("d");

        System.out.println("8 is located at " + (getIndex+1) + " index");
    }
}
