public class defaultt {
    public static void main(String[] args) {

        Stuudent s1 = new Stuudent();
        System.out.println(s1.name);
        // as we have not assigend any value to this object so default String  value will be created
        System.out.println(s1.roll);
        // here deafault int value will be printed
        /*
        default values for
        int -- 0
        floating -- 0.00
        boolean -- false
        String -- null
         */

        int x ; // local varibale iska scope only ye main tak h
       // System.out.println(x); if we not assign any value and try to print any loca varibale
        // it will give error
        // asa isiliye hota he coz java local variable ka scope ek func tak hi limited hota

    }
}

class Stuudent {
    String name ;  // instance varibale .. these have default variable
    int roll ;
    String clg ;

    void Attendance () {    // instance method
        System.out.println(name + " is present  ");
    }



}
