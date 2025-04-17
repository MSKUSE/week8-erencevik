public class TestShape {
    public static void main(String[] args) {
        //Shape square = new Rectangle("blue",3,4);
        //square.describe();

        Rectangle r1 = new Rectangle("blue",5,6);
        Rectangle r2 = new Rectangle("red",5,6);
        System.out.println(r1.equals(r2));
    }
}
