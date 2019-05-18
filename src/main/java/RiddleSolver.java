import java.util.Arrays;
import java.util.stream.Collectors;

class RiddleSolver {

    String solve(String input) {
        return String.join(" ", Arrays.stream(input.replaceAll("W+", " ").split(" "))
                .filter(x -> x.length() > 0)
                .map(x -> String.valueOf(x.length()))
                .collect(Collectors.toList()));
    }
}
