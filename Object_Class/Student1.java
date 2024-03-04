public class Student1 {
    int id;
    String name;
    
}
class TestStudent3{
    public static void main(String args[]){
        //Creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        //Initializing objects
        s1.id = 786;
        s2.name = "sukkon";
        s2.id = 687;
        s2.id = 102;
        s2.name = "Pawar";
        //Printing
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
