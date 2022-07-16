import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest5_y {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    @RequiresNonNull("variable_3")
    public void method_1() {
        //dummy_lines
    }

    public void method_2(RequiresNonNullTest5_y variable_4) {
        //dummy_lines
        // :: error: (contracts.precondition.not.satisfied)
        variable_4.method_1();
    }
}
