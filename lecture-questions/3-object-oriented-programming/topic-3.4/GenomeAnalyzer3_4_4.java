class GenomeAnalyzer3_4_4 {
    double gcCount = 0;
    public double gcContent(String sequence) {
        for (int i = 0 ; i < sequence.length() ; i++) {
            if (sequence.charAt(i) == 'G' || sequence.charAt(i) == 'C') {
                gcCount++;    
            }
        }
    return gcCount / sequence.length();
    }
}