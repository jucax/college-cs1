class GenomeAnalyzer3_4_6 {
    public boolean hasRepeat(String sequence) {
    boolean re = false;
    for (int i = 1 ; i < sequence.length() ; i++) {
        if (sequence.charAt(i-1) == sequence.charAt(i)) {
            re = true;    
        }
    }
        return re;
    }
}