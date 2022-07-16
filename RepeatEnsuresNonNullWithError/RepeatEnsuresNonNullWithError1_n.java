import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNullWithError1_n {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    public boolean method_1() {
        //dummy_lines
        variable_1 = "variable_1";
        variable_2 = "variable_2";
        variable_3 = null;
        return true;
    }
}
