import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@org.checkerframework.framework.qual.DefaultQualifier(Nullable.class)
public class RawMethodInvocation1_n {
    Object variable_1;
    Object variable_2;

    RawMethodInvocation1_n(boolean variable_3) {
        variable_1 = 1;
        method_1();
    }

    @EnsuresNonNull("variable_2")
    void method_1(@UnknownInitialization RawMethodInvocation1_n this) {
        //dummy_lines
        variable_2 = 2;
    }
}
