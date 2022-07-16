import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked10_y {

    static class inner_class_1 {
        static @Nullable Object variable_1;
        @EnsuresNonNull("inner_class_1.variable_1")

            // :: error: (contracts.postcondition.not.satisfied)
        void method_1() {
            //dummy_lines
        }
    }
}
