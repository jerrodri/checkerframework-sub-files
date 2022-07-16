import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNull6_n {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    @EnsuresNonNull.List({@EnsuresNonNull("variable_1"), @EnsuresNonNull("variable_2")})
    @EnsuresNonNull("variable_3")
    public void method_1() {
        //dummy_lines
        method_2();
    }
    @EnsuresNonNull.List({@EnsuresNonNull("variable_1"), @EnsuresNonNull("variable_2")})
    @EnsuresNonNull("variable_3")
    public void method_2() {
        //dummy_lines
        variable_1 = "variable_1";
        variable_2 = "variable_2";
        variable_3 = "variable_3";
    }
}
