interface Student {
    void study();

}

interface Employee {
    void work();

}

class Person implements Employee,Student{
   private String name;
    Person(String name){
        this.name=name;
    }
    public  void work(){
        System.out.println(name + " is Working." );
    }


    public void study() {
        System.out.println(name +" is Studying.");
    }
}


public class MultipleInheritence {
    public static void main(String[] args) {

        Person ob=new Person("Bhishma");

        ob.study();
        ob.work();
    }
}
