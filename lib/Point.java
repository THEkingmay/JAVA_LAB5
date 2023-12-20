package lib;
import java.lang.Math;
public class Point{
    private double x;
    private double y;
    private static int count=0;
    public Point(){
         this(0,0);
    }
    public Point(double x,double y){
          setX(x);setY(y);
          increseCount();
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public static int getCount(){
        return count;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
  
    public static void setCount(int count){
       Point.count=count;
    }
    public double distance(){
        return distance(0,0);
    }
    public double distance(double x2,double y2){
            return Math.sqrt((Math.pow((x-x2), 2)+Math.pow((y-y2), 2)));
    }
    public double distance(Point p){
         return distance(p.x,p.y);

    }
    public void increseCount(){
            count++;
    }
    public String toString(){
        String s="("+getX()+","+getY()+")";
        return s;
    }

}