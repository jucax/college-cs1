public class solution3_1_1 {
    public static void main (String[] args) {        
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int rest = 0;
        for (int i = 0; i < numbers.length; i++){
            rest = numbers[i] % 2;
            if (rest == 0){
                System.out.println(numbers[i]);    
            }
        }
    }
}