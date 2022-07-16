import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE23_y {
    static class inner_class_1 {
        @Nullable Object variable_1;

        @RequiresNonNull("variable_1")
        void method_1() {
            //dummy_lines
        }
    }
    static class inner_class_2 extends inner_class_1 {
        @Nullable Object variable_2;

        @Override
        @RequiresNonNull({"variable_1", "variable_2"})
            // :: error: (contracts.precondition.override.invalid)
        void method_1() {
            variable_2.hashCode();
            //dummy_lines
        }
    }
    public static void method_3(String[] variable_3) {
        //dummy_lines
        inner_class_1 variable_4 = new inner_class_2();
        variable_4.variable_1 = new Object();
        variable_4.method_1();
    }
}
