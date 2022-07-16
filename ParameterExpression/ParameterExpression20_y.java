import org.checkerframework.checker.nullness.qual.*;

public class ParameterExpression20_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNullIf(result = true, expression = "variable_1")
    // :: warning: (expression.parameter.name.shadows.field)
    public boolean method_1(@Nullable Object variable_1) {
        //dummy_lines
        variable_1 = new Object();
        return false;
    }
}
