class Animal{
    void displayAnimal(){
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal{
    void displayDog(){
        System.out.println("I am a Dog");
    }
}
class PetDog extends Dog{

    void displayPetDog() {
        System.out.println("I am a Pet DOg");
    }
}

class StreetDog extends  Dog{
    void displayStreetDog(){
        System.out.println("I am a Street Dog");
    }
}
public class HybridInheritence {
    public static void main(String[] args) {

        StreetDog sd=new StreetDog();
        sd.displayAnimal();
        sd.displayDog();
        sd.displayStreetDog();


        PetDog pd=new PetDog();
        pd.displayAnimal();
        pd.displayDog();
        pd.displayPetDog();

    }
}

