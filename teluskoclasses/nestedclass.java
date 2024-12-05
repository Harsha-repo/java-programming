public class nestedclass {


    public void display()
    {
            System.out.println("iam in main class");
    }
        public class nested
        {
            public void displays()
            {
                System.out.println("im in nested class");
            }
        }
    public void show()
    {
        nested n = new nested();
        n.displays();
    }

    public static void main(String[] args) {
        nestedclass a = new nestedclass();
        a.show();
        a.display();
    nested b = a.new nested();     // class name   object  =  mainobject . new subclass();
    b.displays();
    }
    }
    

    // a static member cannot be used inside the inner class and is not allowed , pops error 
    // mutiple inner classes can be created and then objects cna be created and then accessed .
