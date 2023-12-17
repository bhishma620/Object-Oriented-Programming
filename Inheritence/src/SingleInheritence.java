class  Parent{

    public String name;


  Parent(String name){
      this.name=name;
  }

   String getParentName(){
       return this.name;
    }


}


class Child extends Parent{
    String name;

    Child(String name,String Pname){
        super(Pname);
        this.name=name;
    }

    String getChildName(){
        return this.name;
    }

}

public class SingleInheritence {
 public static void main(String[] args) {

Child ob=new Child("ABC","XYZ");

     System.out.println("Parent name:" + ob.getParentName());
     System.out.println("Child name:" + ob.getChildName());


    }
}