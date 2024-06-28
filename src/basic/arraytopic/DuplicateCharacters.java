package basic.arraytopic;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        System.out.println("Duplicate characters in the string:");
        // Find and print characters that appear more than once
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " : " + charCount[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        findDuplicateCharacters(input);
    }
}

