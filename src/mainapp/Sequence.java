
package mainapp;

/**
 *
 * @author jeff Bryan
 * CMIS 242
 * Project 3
 * 
 */
public final class Sequence {
    
     private static int efficiency = 0;

    
    public static int computeIterative(int n) { // iterative
        efficiency = 0;
        int returnValue = 0;
        if (n == 0) {
            efficiency++;
            return 0;
        } else if (n == 1) {
            efficiency++;
            return 1;
        } else {
            int last = 1;
            int nextLast = 0;
            int thirdLast = 0;
            for (int i = 2; i <= n; i++) {
                efficiency++;
                returnValue = 2 * last + nextLast - thirdLast;
                thirdLast = nextLast;
                nextLast = last;
                last = returnValue;
            }
        }
        return returnValue;
    }

    /**
     * receive input, set counter to 0, return n
     */
    public static int computeRecursive(int n) { // recursive
        efficiency = 0;
        return computeRecursiveHelper(n);
    }

    
    private static int computeRecursiveHelper(int n) {
        if (n == 0) {
            efficiency++;
            return 0;
        } else if (n == 1) {
            efficiency++;
            return 1;
        } else {
            efficiency++;
            return 2 * computeRecursiveHelper(n - 1) + computeRecursiveHelper(n - 2);
        }
    }

    public static int getEfficiency() {
        return efficiency;
    }

    // Private constructor so that no object can be created from this class
    private Sequence() {}

}
    

