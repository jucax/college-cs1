public class solution4_3_1 {
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
}