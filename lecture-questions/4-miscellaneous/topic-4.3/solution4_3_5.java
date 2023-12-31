import java.util.ArrayList;
public class solution4_3_5 {
    public static boolean isPrime(int num) {
        int rest = 0;
        boolean prime = true;

        for (int i = 2; i < num; i++){
            rest = num % i;
            if(rest == 0){
                prime = false;
            } 
        }

        return prime;
    }

    public static ArrayList<Integer> numToArrayList(int num) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(num);
        return nums;
    }

    public static int smallestNonTrivialFactor(int num) {
        int k = 1;

        for (int i = num - 1 ; i > 1 ; i--) {
            if ((num % i) == 0) {
                k = i;
            }
        }

        return k;
    }

    public static ArrayList<Integer> combinedArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<Integer>();
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }

    public static ArrayList<Integer> primeFactorization(int num) {
        if (isPrime(num)) {
            return numToArrayList(num);
        } else {
            int i = smallestNonTrivialFactor(num);
            return combinedArrayLists(primeFactorization(i), primeFactorization(num/i));
        }
    }
}