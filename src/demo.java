
public class demo {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.GetInstance();
        Singleton singleton2=Singleton.GetInstance();
        // before calling get instance method
        //the class should be  Sataic

        System.out.println(singleton2==singleton1);
        System.out.println(singleton1.equals(singleton2));
        //false not a same object

    }
}