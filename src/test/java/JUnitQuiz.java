import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class JUnitQuiz {
    @Test
    public void junitTest1(){
        String name1= "홍길동";
        String name2= "홍길동";
        String name3= "홍길은";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();
        assertThat(name1).isEqualTo(name2);
        assertThat(name1).isNotEqualTo(name3);
    }
    @Test
    public void junitTest2(){
        int n1 = 15;
        int n2 = 0;
        int n3 = -5;
        assertThat(n1).isPositive();
        assertThat(n2).isZero();
        assertThat(n3).isNegative();
        assertThat(n1).isGreaterThan(n2);
        assertThat(n3).isLessThan(n2);


    }
}
