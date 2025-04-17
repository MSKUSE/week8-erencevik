public class Shape {

    private String color = "white";

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double area(){
        return 0.0;
    }
    private double perimeter(){
        return 0.0;
    }

    public void describe(){
        System.out.println("This is a shape and its coloe is :" + this.color);
    }
/*
    //Overloading:
    public void describe(int sideA, int sideB){
        System.out.println("SideA: " + sideA + " SideB: " + sideB);
    }

    //Overloading:
    public void describe(int sideA){
        System.out.println("SideA: " + sideA);
    }

    //Overloading:
    public void describe(double sideA){
        System.out.println("Radius: " + sideA);
    }

 */
}
