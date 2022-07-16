import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest13_y {
 

    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        //dummy_lines
        return null;
    }
    void method_2(@Nullable Object variable_1) {
        //dummy_lines
        // set the field returned by getSuperclass.
    }

    static void method_3(PureTest13_y variable_2) {
        //dummy_lines
        if (!(variable_2.method_1() instanceof Object)) {
            return;
        } else {
            variable_2.method_2(null);
        }
        // :: error: (dereference.of.nullable)
        variable_2.method_1().toString();
    }
}
