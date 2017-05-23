package bigNumber;

import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.*;

public class BigNumberTest {

    @Test
    public void when_we_have_5_10000_sum_should_return_50000() {
        BigNumber bigNumber = new BigNumber(5, "10000 10000 10000 10000 10000");
        assertThat(bigNumber.sum().toString()).isEqualTo("50000");
    }

    @Test
    public void when_we_have_5_10000000000000000000000_sum_should_return_50000000000000000000000() {
        BigNumber bigNumber = new BigNumber(5, "10000000000000000000000 10000000000000000000000" +
                " 10000000000000000000000 10000000000000000000000 10000000000000000000000");
        assertThat(bigNumber.sum()).isEqualTo(new BigInteger("50000000000000000000000"));
    }

}