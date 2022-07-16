// Test case for Issue 391:
// https://github.com/typetools/checker-framework/issues/391

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

class outer_Issue3913_n {
    private @Nullable String variable_1 = null;

    @EnsuresNonNull("variable_1")
    public void method_1() {
        variable_1 = "";
        //dummy_lines
    }

    @RequiresNonNull("variable_1")
    public String method_2() {
        //dummy_lines
        return variable_1;
    }
}
public class Issue3913_n{
    outer_Issue3913_n variable_2 = new outer_Issue3913_n();

    @RequiresNonNull("variable_2.variable_1")
    void method_3() {
        //dummy_lines
    }
}
