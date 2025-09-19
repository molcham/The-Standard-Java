package ch6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("MainMethod excute!");
        firstMethod();
        System.out.println("MainMethod excute!");
    }

    static void firstMethod() {
        System.out.println("FirstMethod excute!");
        secondMethod();
        System.out.println("FirstMethod finish!");
    }

    static void secondMethod(){
        System.out.println("SecondMethod excute!");
        System.out.println("SecondMethod finish!");
    }
    
}
