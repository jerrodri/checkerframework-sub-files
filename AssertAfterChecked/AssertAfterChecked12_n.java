import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked12_n {

    static class inner_class_1 {
        static @Nullable Object variable_1;

        @EnsuresNonNull("inner_class_1.variable_1")
        void method_1() {
            variable_1 = new Object();
            //dummy_lines
        }
        void method_2() {
            method_1();
            inner_class_1.variable_1.toString();
            //dummy_lines
        }
    }
}
