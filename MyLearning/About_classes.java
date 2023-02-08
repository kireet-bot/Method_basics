package MyLearning;

class square{

     public void square_area(int a){
          int area = a*a;
          int perimeter = 4*a;
          System.out.println("The area of square is "+ area );
          System.out.println("The perimeter of the square is "+ perimeter);
    }
 }

  class Cylinder{
     private int radius, height;
    public Cylinder(){
        radius = 3;
        height = 4;
    }
     public int SurfaceArea(){
        return (int) (2*Math.PI*radius*height);
     }

     public int volume(){
        return (int) (Math.PI*radius*radius*height);

     }
  }

  public class About_classes {
      public static void main(String[] args) {
          square mysquare = new square();
          mysquare.square_area(9);


          Cylinder Mycylinder = new Cylinder();
          System.out.println(Mycylinder.SurfaceArea());
          System.out.println(Mycylinder.volume());


    }
}
