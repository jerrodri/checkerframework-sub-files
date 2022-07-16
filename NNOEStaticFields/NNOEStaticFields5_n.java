import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import java.util.Collections;
import java.util.Set;
public class NNOEStaticFields5_n {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    @RequiresNonNull("NNOEStaticFields5_n.variable_1")
    void method_1() {
        NNOEStaticFields5_n.variable_1.toString();
        //dummy_lines
    }

    class inner_class_1 {
        void method_1(NNOEStaticFields5_n variable_3) {
            //dummy_lines
            NNOEStaticFields5_n.variable_1 = "haha!";
            variable_3.method_1();
        }
    }
}
