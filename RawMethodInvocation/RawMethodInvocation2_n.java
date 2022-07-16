import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@org.checkerframework.framework.qual.DefaultQualifier(Nullable.class)
public class RawMethodInvocation2_n {
    Object variable_1;
    Object variable_2;

    RawMethodInvocation2_n(boolean variable_3) {
        variable_1 = 1;
        method_1();
    }

    @EnsuresNonNull("variable_2")
    void method_1(@UnknownInitialization RawMethodInvocation2_n this) {
        variable_2 = 2;
        //dummy_lines
    }
    RawMethodInvocation2_n(int variable_4) {
        method_2();
    }

    @EnsuresNonNull({"variable_1", "variable_2"})
    void method_2(@UnknownInitialization RawMethodInvocation2_n this) {
        //dummy_lines
        variable_1 = 1;
        variable_2 = 2;
    }
}
