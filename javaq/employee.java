// creating a method that is used to increase the salary of the employee as per the incremet percent 
import java.util.*;
public class employee {

    public double salaryhike(double increase, double salary){
        
        double newsalary = salary +salary*(increase/100);

        return  newsalary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        Double salary,increase;
        System.out.println("enter the name of the employee:");
        String name = sc.next();
        System.out.println("enter the id :");
        id = sc.nextInt();
        System.out.println("enter the salary :");
        salary = sc.nextDouble();
        System.out.println("enter the percentage increase:");
        increase = sc.nextDouble();

        employee obj = new employee();
        System.out.println("NAME:  "+name+"ID  "+id+"salary  "+salary+"increased salary  "+obj.salaryhike(increase,salary));


    }


}
