import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RiddleSolverTest {

    private static RiddleSolver riddleSolver = new RiddleSolver();

    @Parameters(name = "input \"{0}\" yields \"{1}\"")
    public static Object[][] params() {
        return new Object[][]{
                {"BBW", "2"},
                {"BWBWB", "1 1 1"},
                {"WWWW", ""},
                {"BBBB", "4"},
                {"WBBBBWWBWBBBW", "4 1 3"}
        };
    }

    @Parameter
    public String input;

    @Parameter(1)
    public String output;

    @Test
    public void riddle() {
        assertEquals(output, riddleSolver.solve(input));
    }
}