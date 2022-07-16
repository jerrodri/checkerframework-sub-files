import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA21_n {
    static class inner_class_1 {
        Object variable_1;

        @EnsuresNonNull("variable_1")// Super.f must be non-null
        void method_1(@UnknownInitialization inner_class_1 this) {
            //dummy_lines
            variable_1 = new Object();
        }
        inner_class_1() {
            method_1();
        }
    }
}
