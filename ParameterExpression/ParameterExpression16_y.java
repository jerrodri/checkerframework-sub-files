import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression16_y {
    @Nullable Object variable_1 = null;
    @RequiresNonNull("variable_2")
    // :: error: (flowexpr.parse.error)
    public void method_1(Object variable_2) {
        //dummy_lines
    }
}
