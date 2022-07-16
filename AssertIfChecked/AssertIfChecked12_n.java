import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked12_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @EnsuresNonNullIf(result = true, expression = "#1")
    boolean method_1(final @Nullable Object variable_3) {
        //dummy_lines
        if (variable_3 == null) {
            return false;
        }
        return true;
    }
}