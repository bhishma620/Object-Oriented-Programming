class CalculateSum{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    int sum(int []arr){
        int totalSum=0;
        for(int element :arr)totalSum+=element;
        return totalSum;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        CalculateSum ob=new CalculateSum();

        System.out.println(ob.sum(2,5));

        System.out.println(ob.sum(5.6f,2.8f));

        System.out.println(ob.sum(new int []{1,3,4,5}));

        System.out.println(ob.sum(1,2,3));

    }
}