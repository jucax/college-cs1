public class solution4_3_3 {
    public static int smallestNonTrivialFactor(int num) {
        int k = 1;

        for (int i = num - 1 ; i > 1 ; i--) {
            if ((num % i) == 0) {
                k = i;
            }
        }

        return k;
    }
}