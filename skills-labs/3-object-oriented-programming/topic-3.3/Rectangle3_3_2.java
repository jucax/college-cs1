class Rectangle3_3_2 {
    private double width;
    private double height;
    
    public Rectangle3_3_2(double sideLength){
        width = sideLength;
        height = sideLength;
    }

    public Rectangle3_3_2(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double computeArea(){
        return width * height;   
    }

    public double computePerimeter(){
        return (width * 2) + (height * 2);   
    }

    public double getHeight(){
        return height;   
    }

    public double getWidth(){
        return width;   
    }
}