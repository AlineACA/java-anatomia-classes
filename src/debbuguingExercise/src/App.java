package debbuguingExercise.src;

public class App {
    public static void main(String[] args) {
        System.out.println("Main method starting point");
        a();
        System.out.println("Program ended in the Main method");
    }
    
    static void a() {
        System.out.println("Method A start!");
        b();
        System.out.println("Method A ended!");
    }

    static void b() {
        System.out.println("Hello, Method B!");
        for(int i = 0; i<= 4; i++) System.out.println(i);
        c();
        System.out.println("Method B ended!");
    }

    static void c() {
        System.out.println("I C this Method!");
        //Thread.dumpStack();
        System.out.println("It was nice to C ya!");

    }
}
