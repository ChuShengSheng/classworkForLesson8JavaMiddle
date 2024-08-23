package funcyionalProgrammingL7;

import java.io.IOException;
import java.util.function.Supplier;

public class FunctionalExample {
    public FunctionalExample(){
    }

    public static void main(String[] args) throws IOException {
        System.out.println("start 1");
        withoutLazy(heavyFunction());
        System.out.println("finish 1");
        System.out.println("start 2");
        withLazy(() -> {
            return heavyFunction();
        });
        System.out.println("finish 2");
    }

    public static void withoutLazy(Integer integer){
        boolean condition = getCondition();
        if(condition){
            System.out.println(integer);
        }
    }

    public static void withLazy(Supplier func){
         boolean condition = getCondition();
         if(condition){
             System.out.println(func.get());
         }
    }

    private static boolean getCondition(){
        return false;
    }

    private static Integer heavyFunction(){
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException var1) {
            InterruptedException e = var1;
            e.printStackTrace();
        }
        return 42;
    }
}
