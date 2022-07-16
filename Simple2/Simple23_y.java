import org.checkerframework.checker.nullness.qual.*;

public class Simple23_y {

    @NonNull String variable_1;

    public Simple23_y() {
        //dummy_lines
        // :: error: (method.invocation.invalid)
        method_1();

        variable_1 = "abc";
    }
    
    public void method_1() {
        System.out.println(variable_1.toLowerCase());
    }
    
    public static void method_2(String[] variable_2) {
        //dummy_lines
        new Simple23_y();
    }
}
