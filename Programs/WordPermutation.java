import java.util.Scanner;
public class WordPermutation {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String str=sc.nextLine();
        System.out.println("All Possible Permutations are:");
        permutation(str);
    }
    public static void permutation(String input)
    {
        permutation("", input);
    }
    private static void permutation(String perm, String word)
    {
        if (word.isEmpty())
        {
            System.err.println(perm + word);

        } else
            {
            for(int i = 0; i < word.length(); i++)
            {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }

    }
}
