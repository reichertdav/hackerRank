package appendAndDelete;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AppendAndDeleteTest {

    @Test
    public void when_we_have_string1_and_string2_append_should_return_string1string2() {
        AppendAndDelete appendAndDelete = new AppendAndDelete("string1", "string2", 4);

        assertThat(appendAndDelete.append()).isEqualTo("string1string2");
    }

    /*
    @Test
    public void when_we_have_string1_delete_should_return_string() {
        AppendAndDelete appendAndDelete = new AppendAndDelete("string1", "azer", 4);

        assertThat(appendAndDelete.delete()).isEqualTo("string");
    }

    @Test
    public void when_we_have_empty_string_delete_return_empty_string(){
        AppendAndDelete appendAndDelete = new AppendAndDelete("", "abcd", 4);

        assertThat(appendAndDelete.delete(Position.FIRST)).isEqualTo("");

    }
*/
    @Test
    public void when_we_have_string1_and_string2_diff_should_return_1(){
        AppendAndDelete appendAndDelete = new AppendAndDelete("string1", "string2", 4);

        assertThat(appendAndDelete.diff()).isEqualTo(1);
    }


    @Test
    public void when_we_have_less_change_that_k_isPossible_should_return_true(){
        AppendAndDelete appendAndDelete = new AppendAndDelete("string1", "string2", 4);

        assertThat(appendAndDelete.isPossible()).isTrue();
    }

    @Test
    public void test(){
        AppendAndDelete appendAndDelete = new AppendAndDelete("qwerasdf", "qwerbsdf", 6);

        assertThat(appendAndDelete.isPossible()).isFalse();

    }
}
