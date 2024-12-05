interface inter {
    public int add(int i, int j);

}
public class lambda1 {
    public static void main(String[] args) {
        inter in = (i,j)->  i+j;
        int result = in.add(3,4);
        System.out.println(result);
    }
    
}
