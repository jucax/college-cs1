public class ArrayUtils3_4_8 {
    public void arrayAbsoluteValue(double[] array){
        for (int i = 0 ; i < array.length ; i ++){
            if (array[i] < 0){
                array[i] *= -1;    
            }
        }
    }
}