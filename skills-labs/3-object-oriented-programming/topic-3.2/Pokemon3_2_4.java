class Pokemon3_2_4 implements Comparable<Pokemon>{
    // instance variables
    String name;
    int level;

    public String toString(){
        return "Level " + level + " " + name;    
    }

    public boolean equals(Object other){
        if (!(other instanceof Pokemon)){
            return false;    
        }
        
        Pokemon pokemon = (Pokemon) other;
        return name.equals(pokemon.name) && (level == pokemon.level);
    }

    public int compareTo(Pokemon other){
        if(name.equals(other.name)){
            if(level > other.level){
                return 1;    
            } else if (level == other.level){
                return 0;    
            } else {
                return -1;    
            }
        } else {
            if (name.compareTo(other.name) > 0){
                return 1;    
            } else if (name.compareTo(other.name) < 0){
                return -1;    
            } else {
                return 0;    
            }
        }
    }
    
}