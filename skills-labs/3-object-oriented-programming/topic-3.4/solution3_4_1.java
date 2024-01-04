public class solution3_4_1 {
    public long factorial(int n) {
        long product = 1;

        for (int i = 0 ; i < n ; i++) {
            product *= n - i;
        }

        return product;
    }
}