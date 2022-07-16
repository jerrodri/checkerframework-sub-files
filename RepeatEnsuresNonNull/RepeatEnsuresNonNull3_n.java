import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNull3_n {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    @EnsuresNonNullIf(
            expression = {"variable_1", "variable_2"},
            result = true)
    @EnsuresNonNullIf(expression = "variable_3", result = true)
    public boolean method_1() {
        //dummy_lines
        return method_2();
    }
    @EnsuresNonNullIf(
            expression = {"variable_1", "variable_2"},
            result = true)
    @EnsuresNonNullIf(expression = "variable_3", result = true)
    public boolean method_2() {
        //dummy_lines
        variable_1 = "variable_1";
        variable_2 = "variable_2";
        variable_3 = "variable_3";
        return true;
    }
}
