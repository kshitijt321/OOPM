public class objectnclass {
    public static void main(String[] args) {
        // creating obj
        Student s1 = new Student();
        Student s2 = new Student();


        // accessing feild
        s1.name = "rahul ";
        s1.age= 21;
        s1.roll= 219;

        s2.name = "rohan  ";
        s2.age= 21;
        s2.roll= 209;

        s1.markAttendence();
        s2.markAttendence();
        s1.print();
        s2.print();


    }
}
class Student {
    // characteristics or data
    String name ;
    int age ;
    int roll ;

    // behavior
    void markAttendence () {
        System.out.println("attendence marked by "+ name );

    }
    void print (){
        System.out.println(name + ","+ age + ", "+ roll );
    }


}
