import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA1_n {
    static class inner_class_1 {
        Object variable_1;

        @EnsuresNonNull("variable_1")
        void method_1(@UnknownInitialization inner_class_1 this) {
            variable_1 = new Object();
            //dummy_lines
        }
        inner_class_1() {
            
            method_1();
        }
    }
}
