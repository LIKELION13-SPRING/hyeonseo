import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {
    @Test
    public void junitQuiz3(){
        System.out.println("JUnitQuiz3");
    }

    @Test public void junitQuiz4(){
        System.out.println("JUnitQuiz4");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Hello!");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Bye!");
    }
}
