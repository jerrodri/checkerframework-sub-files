import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked4_n {

    static class inner_class_1 {
        static @Nullable Object variable_1;

        @EnsuresNonNull("variable_1")
        void method_1() {
            //dummy_lines
            variable_1 = new Object();
        }
    }
}
