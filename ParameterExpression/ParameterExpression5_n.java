import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression5_n {
    @Nullable Object variable_1 = null;

    // Postconditions
    @EnsuresNonNull("variable_1") // OK
    public void variable_1() {
        variable_1 = new Object();
        //dummy_lines
    }
}
