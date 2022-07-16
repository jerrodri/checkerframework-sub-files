import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA31_n {
    static class inner_class_1 {
        Object variable_1;
        Object variable_2;

        @EnsuresNonNull({"variable_1", "variable_2"})
        void method_1(@UnknownInitialization inner_class_1 this) {
            //dummy_lines
            variable_1 = new Object();
            variable_2 = new Object();
        }
        inner_class_1() {
            method_1();
        }
    }
}
