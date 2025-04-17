public class Rectangle extends Shape {

    private int sideA= 0, sideB= 0;

    public Rectangle(){

    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void describe(){
        System.out.println("SideA: " +this.sideA + " SideB: " +this.sideB);
        super.describe();
    }

    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        if (this.sideA == r.sideA && this.sideB == r.sideB && this.getColor().equals(r.getColor())){
            return true;
        }
        else{
            return false;
        }
    }
}
