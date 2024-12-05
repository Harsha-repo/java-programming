import java.lang.Math;
public class mypoints {
    int x;
    int y;

    public mypoints(){
        this.x=0;
        this.y=0;
    }
    public mypoints(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setxy(int x,int y){

        this.x=x;
        this.y=y;
    }

    public int[] getxy(){
        return new int[] {x,y};

    }

    public  String display(){
        return "("+x+","+y+")";

    }

    public double distance(int x,int y){
      System.out.println("this.x  and this.y:"+this.x+this.y);
      System.out.println("x and y :"+x+y);
      int xdiff = this.x-x;
      int ydiff = this.y-y;


        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
    public double distance(mypoints another){

        return distance(another.x,another.y);

    }
    public double distance(){
        return distance(0,0);
    }

    public static void main(String[] args) {
        mypoints p1 = new mypoints();
        mypoints p2 = new mypoints(3,4);
        p1.setxy(1,2);

        System.out.println(p1.display());
        System.out.println(p2.display());

        System.out.println("the distance between points p1 and p2 "+p1.distance(p2));
        System.out.println("the distance between pp2 point and origiin  "+p1.distance());
        System.out.println("the distance between pp2 point and origiin  "+p2.distance());
    }
    }
    
    

