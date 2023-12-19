package lib;
import java.lang.Math;
public class Point{
    private double x;
    private double y;
    private static int count=0;
    public Point(){
         this.x=0;
         this.y=0;
         increseCount();
    }
    public Point(double x,double y){
          this.x=x;
          this.y=y;
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
  
    public void setCount(int count){
       this.count=count;
    }
    public double distance(){
         double d=(x*x)+(y*y);
         return Math.sqrt(d);
         
    }
    public double distance(double x2,double y2){
            double d=(Math.pow((x-x2), 2))+(Math.pow((y-y2), 2));
            return Math.sqrt(d);
    }
    public double distance(Point p){
        double d=(Math.pow((x-p.x), 2))+(Math.pow((y-p.y), 2));
         return Math.sqrt(d);
    }
    public void increseCount(){
            count++;
    }
    public String toString(){
        String s="("+getX()+","+getY()+")";
        return s;
    }

}