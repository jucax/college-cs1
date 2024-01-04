public class solution3_4_7 {
    public static String decimalToBinary(int num) {
        String remainer = "";
        String binaryNum = "";
        String sum = "";
        int i = 1;

        do {
            remainer = ""+(num % 2);
            sum += remainer;
            num /= 2;
        } while (num > 0);

        while(i <= sum.length()) {
            binaryNum += (sum.charAt((sum.length()- i)));
            i++;
        }
        
        return binaryNum;
    }
}