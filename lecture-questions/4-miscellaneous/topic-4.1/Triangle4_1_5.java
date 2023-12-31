class Triangle {
    double side1;
    double side2;
    double side3;
    double s;
    double area;
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double semiperimeter (){
        s = ((side1 + side2 + side3) / 2);
        return s;
    }
    
    public double area (){
        area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        return area;
    }
}