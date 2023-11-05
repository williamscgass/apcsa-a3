import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;

public class Autograder {
    protected static Logger logger = new Logger("RESULTS.txt", 100); // Assuming 100 as the total number of points

    protected void test(String testName, TestFunction fn, Object[] fnParams, Object expected, int numPoints) {
        try {
            Object result = fn.apply(fnParams);
            assertEquals(expected, result);
            logger.writeResult(testName, numPoints, String.valueOf(expected), String.valueOf(result));
            logger.incPoints(numPoints);
        } catch (Exception e) {
            logger.writeResult(testName, 0, String.valueOf(expected), "Exception: " + e.getMessage());
        }
    }


    // Log the total points at the end
    @AfterClass
    public static void logTotalPoints() {
        logger.writeTotalPoints();
    }

    // Functional interface to represent a function to be tested
    interface TestFunction {
        Object apply(Object[] params) throws Exception;
    }
}
