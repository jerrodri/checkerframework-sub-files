import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression13_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNull("variable_1")
    // :: error: (contracts.postcondition.not.satisfied)
    // :: warning: (expression.parameter.name.shadows.field)
    public void method_1(@Nullable Object variable_1) {
        //dummy_lines
        variable_1 = new Object();
    }
}
