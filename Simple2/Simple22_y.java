import org.checkerframework.checker.nullness.qual.*;

public class Simple22_y {

    @NonNull String variable_1;
    
    public Simple22_y() {
        //dummy_lines
        // :: error: (method.invocation.invalid)
        method_1();

        variable_1 = "abc";
    }

    public void method_1() {
        System.out.println(variable_1.toLowerCase());
        //dummy_lines
    }

    public void method_2(Simple22_y variable_2) {
        //dummy_lines
        @Nullable String variable_3 = null;
        // :: error: (dereference.of.nullable)
        variable_3.hashCode();
    }
}
