import lib.*;
public class Main{
      public static void main(String[] args) {
        Point a=new Point();
       a.setX(20);a.setY(50);
        Point b=new Point(30,15);
       System.out.println( a.toString()+"\n"+b.toString());
       System.err.println(a.distance(b));
       System.out.println(a.distance());
       System.out.println(b.distance(10, 100));
       System.out.println(Point.getCount());
      
       MoveablePoint c=new MoveablePoint(25,60,5);
       System.out.println(c.toString());
       c.Forward();
       System.out.println(c.toString());
       c.Backward();
      System.out.println(c.toString());
      }
}