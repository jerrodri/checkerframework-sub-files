import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest6_y {
    

    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        //dummy_lines
        return null;
    }

    static void method_2(PureTest6_y variable_1) {
        if (variable_1.method_1() instanceof Object) {
            return;
        }
        // :: error: (dereference.of.nullable)
        variable_1.method_1().toString();
        //dummy_lines
    }
}
