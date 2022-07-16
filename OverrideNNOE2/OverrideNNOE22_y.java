import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE22_y {
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
            //dummy_lines
            variable_2.hashCode();
        }
    }
}
