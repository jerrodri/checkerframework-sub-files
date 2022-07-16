import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest7_n {

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
    @RequiresNonNull("RequiresNonNullTest7_n.variable_4")
    // :: warning: (purity.deterministic.void.method)
    public void method_2() {
        //dummy_lines
        method_1();
    }
}
