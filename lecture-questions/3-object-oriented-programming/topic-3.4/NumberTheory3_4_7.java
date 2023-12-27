import java.util.ArrayList;
class NumberTheory3_4_7 {
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> computePrimes(int num){
    ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2 ; i <= num ; i++){
            if (isPrime(i)){
            primes.add(i);        
            }
        }
    return primes;

    }
}