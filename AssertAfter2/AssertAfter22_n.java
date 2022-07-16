import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

import java.util.HashMap;
import java.util.List;

public class AssertAfter22_n {

    public class inner_class_1<T> {

        HashMap<T, List<@KeyFor("variable_1") T>> variable_1;

        public inner_class_1(HashMap<T, List<@KeyFor("variable_1") T>> variable_1) {
            this.variable_1 = variable_1;
        }

        @SuppressWarnings("contracts.postcondition.not.satisfied")
        @EnsuresNonNull("variable_1.get(#1)")
        public void method_1(final T variable_2) {
            //dummy_lines
            // body omitted, not relevant to test case
        }

        public void method_2(T variable_3, T variable_4) {
            method_1(variable_3);
            @NonNull List<@KeyFor("variable_1") T> variable_5 = variable_1.get(variable_3);
            //dummy_lines
        }
    }
}
