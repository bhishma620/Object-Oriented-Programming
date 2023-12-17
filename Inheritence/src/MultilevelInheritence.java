class A{
    String name;

    A(String name){
        this.name=name;
    }

    String getAName(){
        return this.name;
    }
}

class B extends A{
    String name;
   B(String nameA,String nameB){
        super(nameA);
        name=nameB;
    }
    String  getBName(){
       return this.name;
    }
}

class  C extends B{
    String name;
    C(String nameA,String nameB,String nameC){
        super(nameA, nameB);
        name=nameC;
    }
    String getCName(){
        return this.name;
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
C ob=new C("GrandParent","Parent","Child");

        System.out.println("A Name:" + ob.getAName());
        System.out.println("B Name:" + ob.getBName());
        System.out.println("C Name:" + ob.getCName());


    }
}
