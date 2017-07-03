package iceCreamParlor;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class IceCreamParlorTest {

    @Test
    public void when_we_have_4_dollard_with_1_4_5_3_2_foundBestCombinaison_should_return_1_4(){
        IceCreamParlor iceCreamParlor = new IceCreamParlor(4,5,"1 4 5 3 2");
        assertThat(iceCreamParlor.foundBestCombinaison()).isEqualTo("1 4");
    }

    @Test
    public void when_we_have_4_dollard_with_2_2_4_3foundBestCombinaison_should_return_1_2(){
        IceCreamParlor iceCreamParlor = new IceCreamParlor(4,4,"2 2 4 3");
        assertThat(iceCreamParlor.foundBestCombinaison()).isEqualTo("1 2");
    }

    @Test
    public void when_we_have_4_dollard_with_1_4_5_3_2_filterByMoney_should_return_1_3_2(){
        IceCreamParlor iceCreamParlor = new IceCreamParlor(4,4,"1 4 5 3 2");
       // assertThat(iceCreamParlor.filterByMoney(iceCreamParlor.posibilities, iceCreamParlor.money)).contains(1, 3, 2);
    }



}