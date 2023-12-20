package lib;

public class MoveablePoint extends Point{
     private double speed;
     public MoveablePoint(){
        this(0,0,0);
     }
     public MoveablePoint(double x,double y,double speed){
         super(x,y);
         this.speed=speed;
     }
     public void Forward(){
         double x=getX();
         double y=getY();
         x=x+speed;
         y=y+speed;
         setX(x);setY(y);
     }
     public void Backward(){
         double x=getX();
         double y=getY();
         x=x-speed;
         y=y-speed;
         setX(x);setY(y);
     }
     public void setSpeed(double speed){
        this.speed=speed;
     }
     public double getSpeed(){
        return speed;
     }
     public String toString(){
        String s= "("+getX()+","+getY()+","+getSpeed()+")";
        return s;
     }

}
