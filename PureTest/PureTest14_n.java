import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest14_n {

    //@Override
    @SideEffectFree
    public String method_1() {
        //dummy_lines
        return "foo";
    }
}
