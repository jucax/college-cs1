class FancyArray3_3_3 {
    private int[] array;
    private String delim;
    
    public FancyArray3_3_3 (int[] array, String delim){
        this.array = array;
        this.delim = delim;
    }
    public int[] getArray(){
        return array;    
    }

    public String getDelim(){
        return delim;    
    }

    public void print(){
        for (int i = 0 ; i < getArray().length - 1 ; i++){
            int num = getArray()[i];
            System.out.print(num + getDelim());  
        }

        System.out.print(getArray()[getArray().length - 1]);
    }
}