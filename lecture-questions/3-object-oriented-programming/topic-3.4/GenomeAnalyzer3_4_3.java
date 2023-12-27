class GenomeAnalyzer3_4_1 {
    int HammingDistance = 0;
    public void printHammingDistance(String word1, String word2) {
        for (int i = 0; i < word1.length(); i++){
            if (word1.charAt(i) != (word2.charAt(i))){
                HammingDistance++;        
            }
        }
    System.out.print(HammingDistance);            
    }
}