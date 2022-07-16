import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked8_n {

    static class inner_class_1 {
        static @Nullable Object variable_1;

        @EnsuresNonNull("inner_class_1.variable_1")
        void method_1() {
            //dummy_lines
            variable_1 = new Object();
        }
    }
}
