public class Oven3_4_5 {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void preheat(){
        temperature = 350;    
    }

    public void preheat(int temp){
        if (temp > 500){
            temperature = 500;    
        } else {
            temperature = temp;    
        }
    }

    public void preheat(int temp, char scale){
        if (scale == 'F'){
            if (temp > 500){
                temperature = 500;    
            } else {
                temperature = temp;    
            }        
        } else if (scale == 'C'){
            double tempc = 1.8 * temp + 32;
            if (tempc > 500){
                temperature = 500;    
            } else {
                temperature = (int)tempc;    
            } 
        }
    }
}