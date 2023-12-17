class SmartPhone{
    void displaySmartPhone(){
        System.out.println("I am a SmartPhone");
    }
}

class AndroidPhone extends  SmartPhone{
    void displayAndroidPhone(){
        System.out.println("I am Android Phone");
    }
}

class IosPhone extends SmartPhone{
    void displayIosPhone(){
        System.out.println("I am Ios PHone");
    }
}

public class HierarchicalInheritence {
    public static void main(String[] args) {
        AndroidPhone ap=new AndroidPhone();
        ap.displayAndroidPhone();
        ap.displaySmartPhone();

        IosPhone ip=new IosPhone();
        ip.displayIosPhone();
        ip.displaySmartPhone();

    }
}
