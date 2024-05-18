package Java;

/**
 * Numbers
 */
public class Numbers {

    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x < 10) {
            System.out.print(sum + " ");
            x = x + 1;
            sum += x;
        }
        System.out.println();
    }
}

/* Variable x must be declared before it can be used 
 * Loop definition is contained inside of curly braces, and the boolean expression that is 
 * contained inside of parentheses.
 * print(...) without the 'ln' means that a new line will not be included
 * 
 */