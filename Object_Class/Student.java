/**
 * Initializing an object means storing data into the object.
 *  Let's see a simple example where we are going to initialize
 *  the object through a reference variable.
 */


public class Student {
    int id;
    String name;
}

class TestStudent2{
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "sukoon";
        System.out.println(s1.id+" "+s1.name); //pronting member with white space
    }
}
