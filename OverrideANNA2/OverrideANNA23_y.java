import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA23_y {
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
            variable_1 = new Object();
            //dummy_lines
        }
        inner_class_2() {
            method_1();
        }
    }
    public static void method_2(String[] variable_3) {
        //dummy_lines
        inner_class_1 variable_4 = new inner_class_2();
        variable_4.variable_1.hashCode();
    }

}
