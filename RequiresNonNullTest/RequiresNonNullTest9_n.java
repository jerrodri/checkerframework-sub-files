import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest9_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    protected static @Nullable Object variable_4;

    @Pure
    @RequiresNonNull("variable_4")
    // :: warning: (purity.deterministic.void.method)
    public void method_1() {
        //dummy_lines
        method_2();
    }

    @Pure
    @RequiresNonNull("RequiresNonNullTest9_n.variable_4")
    // :: warning: (purity.deterministic.void.method)
    public void method_2() {
        //dummy_lines
        method_1();
    }

    public void method_3(RequiresNonNullTest9_n variable_5) {
        //dummy_lines
        variable_4 = new Object();
        variable_5.method_1();

        variable_4 = new Object();
        variable_5.method_2();

        RequiresNonNullTest9_n.variable_4 = new Object();
        variable_5.method_1();
        RequiresNonNullTest9_n.variable_4 = new Object();
        variable_5.method_2();
    }
}
