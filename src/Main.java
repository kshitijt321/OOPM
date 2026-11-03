


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // problem with  current scene ... ex if we want to strore student info

        // String namw = "aditya";
        // some other code line
        // int age = 21;
        // some other code lines
        // int roll =  202;
        // void function ( string name , int age , int roll ){
          // sout ; }
        // problem 1 need a lot of independent varibale to represent a single  student
     // aur name , roll , age bhot bikhra hua he code me hume ye nahi pata ki ye sab ek
     // student aditya ka he
//problem 2 hum agr student ke liye function banate he to hame pure 3 function pass karne padege
//problem 3 new set of variables will be created for new student
        //now what does opps says
        // jese student ke feature he real world me -:
        // name
        // age
        // roll no.
        // clg
        //to student agr hum programing wolrd me represent kare he to hume 4 varible ki jagah
        // ek block banana chaiye jisme charo h [ name , age , rollno. , clg ]
        // hum real world ko programing me mimic karte he taki problem ko solve kar sake  jese
        // student ek real world entity he aur real world me usme bhot sare characteristics he
        //jese name ,  grade , roll , age , height , weight
        // but programing world me hume sab charactericts  nahi chaiye
        // for example for a clg portal we may only need name , age , grade of a student
        class student {   //  ye class create ki he , it is a blue print for a object
            //student real world se programing me represent to kardiya but till now a real obj ( arun
            // varun ) jese student create nahi hue he , and memory block bhi create nahi hue

            // characteristics of student
            String name ;
            int age ;
            int roll ;
        }

        // obj creation

        student s1 ;  // declaration of obj
        // s1 varibale he , which is stored in stack memory and has starting address of student obj


        s1 = new student();// new word means a memory is created in heap memory so
        // a memory is created for student obj



        // block create hua he uski field ko accses kar rahe
        s1.name = "wini";  // s1 obj ki name feild ko accsess kar rha
        s1.age = 21;
        s1.roll = 202;
        // heap me block create hue tha s1 ka usme 3 feild thi wo acsess ki  ye teeno sath me rahengi
        // kyuki ek hi obj ki he ek block ki h

        // new obj
        //s2 ek variable h which is pointing towards block of memory in heap
        student s2 ; // s2 obj block with name ,  age , roll  created  in heap
        s2 = new student();

        // acsessing s2 block feild
        s2.name  = "isis";
        s2.age = 20;
        s2.roll = 118;
        System.out.println(s1.name);


        // for fully mimicing a real world object we need to add behaviour ( kya karta he ) too
        //behaviour can be represented by fucntions
        class Animal {
            // first characteritics
            String type = "herbivore ";
            int noOfLegs = 4;

            // behaviour
            void makeSound (){

            }
            void eat (){

            }

            // ye behaviour ko class ke andar hi rakha he coz ye charactericts ke sath part he animal class  ka
        }







        


    }
}