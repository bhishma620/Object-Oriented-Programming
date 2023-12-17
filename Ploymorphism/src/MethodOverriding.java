
class Boy{
    void role(){
        System.out.println("I am Playing");
    }
}

class Student extends Boy {
    void role(){
        System.out.println("I am reading Books");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Student ob=new Student();
        ob.role();

    }
}
