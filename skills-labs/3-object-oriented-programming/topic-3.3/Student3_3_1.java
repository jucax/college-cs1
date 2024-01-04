class Student3_3_1 {
    // instance variables
    private String name;

    // constructor
    public Student3_3_1(String name) {
        this.name = name;
    }

    // return this Student's name member variable
    public String getName() {
        return name;
    }

    // return the string "Hello! My name is ______!" ("______" is this Student's name)
    public String greet() {
        return "Hello! My name is " + getName() + "!";
    }
}