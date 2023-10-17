public class PangramChecker 
{
    public static boolean isPangram(String str) 
    {
        // Create a boolean array to mark the presence of each letter
        boolean[] alphabet = new boolean[26];
        int totalLetters = 0;

        // Iterate through the characters in the input string
        for (char ch : str.toLowerCase().toCharArray()) 
        {
            if (ch >= 'a' && ch <= 'z') 
            {
                int index = ch - 'a';
                if (!alphabet[index])
                {
                    alphabet[index] = true;
                    totalLetters++;
                }
            }
        }

        // Check if all 26 letters have been marked
        return totalLetters == 26;
    }

    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangram = isPangram(input);
        if (isPangram) 
        {
            System.out.println("The input is a pangram.");
        } 
        else 
        {
            System.out.println("The input is not a pangram.");
        }
    }
}
    

