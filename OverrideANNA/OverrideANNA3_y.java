import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA3_y {
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
        @Override
            
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1(@UnknownInitialization inner_class_2 this) {
            //dummy_lines
        }
    }

    public static void method_2(String[] variable_2) {
        //dummy_lines
        inner_class_1 variable_3 = new inner_class_2();
        variable_3.variable_1.hashCode();
    }
}
