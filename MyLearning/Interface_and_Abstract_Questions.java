package MyLearning;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
         void write(){
             System.out.println("use me to write your details");
    }
         void refill(){
             System.out.println("please refill your pen");
         }
}
class Monkey{
    void jump(){
        System.out.println("I like to jump");
    }
    void bite(){
        System.out.println("I'll bite you");
    }
}

interface Animal {
    void sleep();

    void eat();
}

class Human extends Monkey implements Animal{

    @Override
    public void sleep() {
        System.out.println("I'm sleeping");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}

public class Interface_and_Abstract_Questions {
    public static void main(String[] args) {

        FountainPen MyFountainPen = new FountainPen();
        MyFountainPen.write();

    }
}
