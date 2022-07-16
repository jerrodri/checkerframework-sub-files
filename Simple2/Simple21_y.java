import org.checkerframework.checker.nullness.qual.*;

public class Simple21_y {

    @NonNull String variable_1;

    public Simple21_y() {
        //dummy_lines
        // :: error: (method.invocation.invalid)
        method_1();

        variable_1 = "abc";
    }

    public void method_1() {
        //dummy_lines
        System.out.println(variable_1.toLowerCase());
    }
}
