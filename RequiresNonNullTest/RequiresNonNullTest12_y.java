import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest12_y {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    
    protected static @Nullable Object variable_4;

    @RequiresNonNull("variable_3")
    public void method_1() {
        //dummy_lines
    }

    class inner_class_1 extends RequiresNonNullTest12_y {
        public void method_2(inner_class_1 variable_5) {
            //dummy_lines
            // :: error: (contracts.precondition.not.satisfied)
            variable_5.method_1();
        }
    }
}
