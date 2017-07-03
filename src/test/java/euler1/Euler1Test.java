package euler1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class Euler1Test {


    @Test
    public void when_we_have_10_sum_should_return_2(){

        Euler1 euler1 = new Euler1();
        assertThat(euler1.foundSumOfMultipleOf3and5(2)).isEqualTo(0);
    }
    @Test
    public void when_we_have_10_sum_should_return_23(){

        Euler1 euler1 = new Euler1();
        assertThat(euler1.foundSumOfMultipleOf3and5Version2(10)).isEqualTo(23);
    }

    @Test
    public void when_we_have_10_sum_should_return_100(){

        Euler1 euler1 = new Euler1();
        assertThat(euler1.foundSumOfMultipleOf3and5Version3(100)).isEqualTo(2318);
    }
    @Test
    public void when_we_have_10_sum_should_return_ss100(){
    }

}