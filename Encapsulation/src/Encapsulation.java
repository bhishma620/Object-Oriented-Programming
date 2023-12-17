class Student{
    private String name;
    private  int age;

    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge() {
        return age;
    }

   public String toString(){
       return "NAME: "+ this.name +" and AGE: "+ this.age;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Student ob=new Student();
        ob.setName("Bhishma");
        ob.setAge(20);

        //printing details  by calling methods of Student class

        System.out.println("STDUENT Name : " + ob.getName() +" and Age : " + ob.getAge());

        //using toString()
        System.out.println(ob.toString());

    }
}
