import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

import javax.swing.JMenuBar;

public abstract class FlowExpressionParsingBug12_y {

    //// Check that JavaExpressions with explicit and implicit 'this' work

    protected @Nullable JMenuBar variable_1 = null;
    static @Nullable String variable_2 = null;
    @RequiresNonNull("this.variable_2")
    public void method_1() {
        //dummy_lines
    }

    void method_2() {
        //dummy_lines
        // :: error: (contracts.precondition.not.satisfied)
        method_1();
        FlowExpressionParsingBug12_y.variable_2 = "";
        method_1();
    }
}
