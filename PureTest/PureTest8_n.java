import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest8_n {
 

    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        //dummy_lines
        return null;
    }

    static void method_2(PureTest8_n variable_1) {
        //dummy_lines
        if (!(variable_1.method_1() instanceof Object)) {
        }else {
            variable_1.method_1().toString();
        }
    }
}
