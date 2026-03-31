import java.util.ArrayList;

public class Main{

    static void main() {
        System.out.println("Hello World");
        test(1);
    }

    static void test(int flag){
        new ArrayList<Integer>().add(10);
        // 注释
        int a = 0;
        if (flag == 1){a=1;}

        if (flag == 2){
            a=2;
        }
    }

}