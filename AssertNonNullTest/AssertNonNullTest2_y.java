import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertNonNullTest2_y {
    public @Nullable String variable_1;

    // :: error: (contracts.postcondition.not.satisfied)
    public @EnsuresNonNull("variable_1") void method_1() {
        variable_1 = null;
        //dummy_lines
    }

    public static void method_2(String[] variable_2) {
        //dummy_lines
        AssertNonNullTest2_y variable_3 = new AssertNonNullTest2_y();
        // :: error: (dereference.of.nullable)
        variable_3.variable_1.equals("we");
        AssertNonNullTest2_y variable_4 = new AssertNonNullTest2_y();
        variable_4.method_1();
        variable_4.variable_1.equals("we");
    }
}
