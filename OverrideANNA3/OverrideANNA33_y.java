import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA33_y {
    static class inner_class_1 {
        Object variable_1;
        Object variable_2;

        @EnsuresNonNull({"variable_1", "variable_2"})
        void method_1(@UnknownInitialization inner_class_1 this) {
            variable_1 = new Object();
            variable_2 = new Object();
            //dummy_lines
        }
        inner_class_1() {
            method_1();
        }
    }

    static class inner_class_2 extends inner_class_1 {
        @Override
        @EnsuresNonNull("variable_1")
            
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1(@UnknownInitialization inner_class_2 this) {
            variable_1 = new Object();
        }
    }

    public static void method_2(String[] variable_3) {
        //dummy_lines
        inner_class_1 variable_4 = new inner_class_2();
        variable_4.variable_2.hashCode();
    }
}
