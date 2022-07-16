import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import java.util.Collections;
import java.util.Set;
public class NNOEStaticFields6_n {
        static @Nullable String variable_1 = null;
        static @Nullable String variable_2 = null;

        @RequiresNonNull("NNOEStaticFields6_n.variable_1")
        void method_1() {
                NNOEStaticFields6_n.variable_1.toString();
                //dummy_lines
        }

        class inner_class_1 {
                @RequiresNonNull("NNOEStaticFields6_n.variable_1")
                void method_2(NNOEStaticFields6_n variable_3) {
                        //dummy_lines
                        variable_3.method_1();
                }
        }
}
