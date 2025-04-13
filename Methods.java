public class Methods {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.addNumbers(2,3);
        m.sayHello();
       int x= m.multiply(3,3);
       System.out.println(x);
         
    }
    void sayHello()
    {
        System.out.println("hello");
    }
    void addNumbers(int a,int b){
        System.out.println(a+b);
    }
    int multiply(int a,int b){
        int x=a*b;
        return x;
    }

}
