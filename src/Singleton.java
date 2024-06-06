import sun.security.jca.GetInstance;

public class Singleton {


    private static Singleton singleton=null;
    private Singleton(){}
    // the construture should not be defined because of every class has constructor,but it is not
    // invisible
    public  static Singleton GetInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }

        return singleton;

    }
    
     @Override
    public String toString() {
        return "Computure{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", Dispalysize=" + Dispalysize +
                ", Dispalayspace=" + Dispalayspace +
                '}';
    }



}
