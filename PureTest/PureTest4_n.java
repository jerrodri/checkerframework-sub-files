import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest4_n {
    

    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        //dummy_lines
        return null;
    }

    static void method_2(PureTest4_n variable_1) {
        if ((variable_1.method_1() != null) && variable_1.method_1().equals(Enum.class)) {
            // empty body
            //dummy_lines
        }
    }
}
