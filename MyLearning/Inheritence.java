package MyLearning;
class Rectangle {
    int length, breath;
    public Rectangle(int length, int breath) {
        this.breath=breath;
        this.length=length;
    }

    public void area() {
        System.out.println("The area of the given rectangle is: " + length * breath);
    }
}

class Cuboid extends Rectangle{
    int height;
     public Cuboid(int length, int breath, int height){
         super(length,breath);
         this.height=height;
     }
    public void area(){
          double SurfaceArea = 2*(length*breath + breath*height +height*length);
          System.out.println("The Surface area of the given cuboid is: " + SurfaceArea);
    }
    public void volume(int length, int breath, int height){
        System.out.println("The Volume of the given cuboid is: " + length*breath*height);
    }
}

public class Inheritence {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle();
//         rectangle1.area();

        Cuboid cuboid1 = new Cuboid(5,4,3);
                  cuboid1.area();
    }
}
