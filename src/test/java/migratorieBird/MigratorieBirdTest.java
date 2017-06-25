package migratorieBird;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class MigratorieBirdTest {

    @Test
    public void when_we_have_a_list_with_two_bird_of_type_2_countMaxBird_should_return_two(){

        String birds = "2 2 ";
        MigratorieBird migratorieBird = new MigratorieBird();
        assertThat(migratorieBird.countMaxBird(birds)).isEqualTo(2);

    }

    @Test
    public void when_we_have_a_list_with_two_bird_of_type_2_and_four_bird_of_type_5_countMaxBird_should_return_five(){

        String birds = "2 2 5 5 5 5";
        MigratorieBird migratorieBird = new MigratorieBird();
        assertThat(migratorieBird.countMaxBird(birds)).isEqualTo(5);

    }

}