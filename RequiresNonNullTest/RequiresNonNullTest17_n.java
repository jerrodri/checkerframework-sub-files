import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest17_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    protected static @Nullable Object variable_4;

    private @Nullable Object variable_5;

    static @Nullable Object variable_6 = "m";

    @RequiresNonNull("variable_6")
    void method_1() {
        //dummy_lines
        variable_6 = null;
    }
}
