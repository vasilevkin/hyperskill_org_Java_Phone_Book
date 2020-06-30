import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

class Operator {

    public static UnaryOperator<List<String>> unaryOperator = list -> new ArrayList<String>(new HashSet<String>(list));
}
