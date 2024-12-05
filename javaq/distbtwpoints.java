public class distbtwpoints {
    int x;
    int y;

    distbtwpoints(){
        this.x=0;
        this.y=0;
    }

    distbtwpoints(int x,int y){
        this.x=x;
        this.y=y;

    }

    void setxy(int x ,int y){
        this.x=x;
        this.y=y;
    }

    int [] getxy(){
        return new int[] {x,y};
    }

    String tostring(){
        return "("+x+","+y+")";
    }

    double distance(int x , int y ){
        int xdiff = this.x-x;
        int ydiff = this.y-y;
        return Math.sqrt((xdiff*xdiff)+(ydiff*ydiff));
    }

    double distance(distbtwpoints another){
        return distance(another.x,another.y);
    }

    double distance(){
        return distance(0,0);

    }

    public static void main(String[] args) {
        distbtwpoints p1 = new distbtwpoints();
        distbtwpoints p2 = new distbtwpoints(3,4);

        p1.setxy(1,2);

        System.out.println(p1.tostring());
        System.out.println(p2.tostring());

        System.out.println("the distance b/w p1 and p1 :"+p1.distance(p2));
        System.out.println("the diatnce b/w the p1 and origin:"+p1.distance());
        System.out.println("the distance b/w the p2 and origin "+p2.distance());
        
    }
}
