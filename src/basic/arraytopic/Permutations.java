package basic.arraytopic;

public class Permutations 
{
    // Method to print all permutations of a given string
    public static void printPermutations(String str) 
    {
        printPermutationsHelper(str, "");
    }
    // Helper method to generate permutations
    private static void printPermutationsHelper(String str, String prefix) 
    {
        int n = str.length();
        if (n == 0) 
        {
            System.out.println(prefix);
        } else 
        {
            for (int i = 0; i < n; i++) 
            {
                // Remove character at index i and find permutations of remaining string
                String rem = str.substring(0, i) + str.substring(i + 1);
                printPermutationsHelper(rem, prefix + str.charAt(i));
            }
        }
    }
    public static void main(String[] args) 
    {
        String input = "ABC";
        System.out.println("Permutations of the string \"" + input + "\":");
        printPermutations(input);
    }
}