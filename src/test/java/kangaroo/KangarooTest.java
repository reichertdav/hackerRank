package kangaroo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class KangarooTest {


    @Test
    public void when_kangaroo_first_speedUp_more_than_kangaroo_second_isCatch_should_return_true() {
        Kangaroo firstKangaroo = new Kangaroo(0, 3);
        Kangaroo secondkangaroo = new Kangaroo(3, 2);

        assertThat(firstKangaroo.isCatch(secondkangaroo)).isTrue();
    }

    @Test
    public void when_kangaroo_first_speedUp_more_than_kangaroo_second_but_position_first_is_after_second_iscatch_should_return_false() {
        Kangaroo firstKangaroo = new Kangaroo(3, 3);
        Kangaroo secondkangaroo = new Kangaroo(0, 2);

        assertThat(firstKangaroo.isCatch(secondkangaroo)).isFalse();
    }

    @Test
    public void when_kangaroo_second_speedUp_more_than_kangaroo_first_but_position_first_is_after_second_iscatch_should_return_false() {
        Kangaroo firstKangaroo = new Kangaroo(0, 3);
        Kangaroo secondkangaroo = new Kangaroo(3, 6);
        assertThat(firstKangaroo.isCatch(secondkangaroo)).isFalse();
    }


    @Test
    public void when_kangaroo_second_speedUp_more_than_kangaroo_first_but_position_second_is_after_first_iscatch_should_return_true() {
        Kangaroo firstKangaroo = new Kangaroo(3, 3);
        Kangaroo secondkangaroo = new Kangaroo(0, 4);
        assertThat(firstKangaroo.isCatch(secondkangaroo)).isTrue();
    }

    @Test
    public void when_kangaroo_first_speedUp_more_than_kangaroo_second_without_intersectioisCatch_should_return_false() {
        Kangaroo firstKangaroo = new Kangaroo(0, 5);
        Kangaroo secondkangaroo = new Kangaroo(3, 3);

        assertThat(firstKangaroo.isCatch(secondkangaroo)).isFalse();
    }
}