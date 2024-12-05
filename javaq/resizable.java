public interface resizable {
    void resizeWidth(int width);
    void resizeHeight(int height );
    
}

class rectangle implements resizable{
    private int width;
    private int height;

    rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void resizeWidth(int width){
        this.width = width;
        

    }
    @Override
    public void resizeHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeigt(){
        return this.height;
    }

    public String toString(){
        return "[width ="+width+",height="+height+"]";
    }
}

public class main{
    public static void main(String[] args) {
        rectangle r = new rectangle(3, 4);
        r.resizeWidth(5);
        r.resizeHeight(8);
        r.toString();

    }
}
