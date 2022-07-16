import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA22_y {
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
    static class inner_class_2 extends inner_class_1 {
        Object variable_1;
        @Override
        @EnsuresNonNull("variable_1")
            // We cannot ensure that Super.f is non-null since it is
            // shadowed by Sub.f, hence we get an error.
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1(@UnknownInitialization inner_class_2 this) {
            //dummy_lines
            variable_1 = new Object();
        }
        inner_class_2() {
            method_1();
        }
    }
}
