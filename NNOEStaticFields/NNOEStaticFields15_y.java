import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

import java.util.Collections;
import java.util.Set;

public class NNOEStaticFields15_y {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    static class inner_class_1 {

        // Non-null if doPurity == true
        private static @MonotonicNonNull Set<String> variable_3 = null;

        private static boolean variable_4 = false;

        @EnsuresNonNullIf(result = true, expression = "inner_class_1.variable_3")
        // this postcondition cannot be proved with the Checker Framework, as the relation
        // between doPurity and pureMethods is not explicit
        public static boolean method_1() {
            //dummy_lines
            // :: error: (contracts.conditional.postcondition.not.satisfied)
            return variable_4;
        }

        @RequiresNonNull("inner_class_1.variable_3")
        public static Set<String> method_2() {
            return Collections.unmodifiableSet(variable_3);
            //dummy_lines
        }
    }

    static class inner_class_2 {
        public void method_3() {
            //dummy_lines
            if (inner_class_1.method_1()) {
                for (String variable_5 : inner_class_1.method_2()) {}
            }
        }
    }
}
