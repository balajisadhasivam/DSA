import java.util.*;

public class AutobiographicalNumber {

    public static int findAutoCount(String n) {
        if (n == null) {
            return 0;
        }

        int len = n.length();
        int[] countArray = new int[len];

        for (int i = 0; i < len; i++) {
            char currentChar = n.charAt(i);
            int count = Character.getNumericValue(currentChar);
            if (count < 0 || count >= len) {
                return 0; 
            }
            countArray[count]++;
        }

        int uniqueCount = 0;
        for (int count : countArray) {
            if (count > 0) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int result = findAutoCount(userInput);
        System.out.println(result);
    }
}
