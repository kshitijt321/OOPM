public class consturctor1 {

    // constructor is a special method used to crete obj

    public static void main(String[] args) {

        kutta k1 = new kutta();
        System.out.println(k1.name);



    }
}
class kutta {
    String name ;
    int roll ;
    int age ;

    kutta (){  // same name as class and  no return type
        name = "rono";
        roll = 12;
        age = 21;
        // ye default values set hori he now if we simply call acesess name it will print rono

    }
}

