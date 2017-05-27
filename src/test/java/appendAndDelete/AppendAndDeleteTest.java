package appendAndDelete;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AppendAndDeleteTest {

    @Test
    public void when_we_have_string1_and_string2_append_should_return_string1string2() {
        AppendAndDelete appendAndDelete = new AppendAndDelete("string1", "string2");

        assertThat(appendAndDelete.append()).isEqualTo("string1string2");
    }

    @Test
    public void when_we_have_string1_delete_should_return_string() {
        AppendAndDelete appendAndDelete = new AppendAndDelete("string1", "azer");

        assertThat(appendAndDelete.delete(Position.FIRST)).isEqualTo("string");
    }

    @Test
    public void when_we_have_empty_string_delete_return_empty_string(){
        AppendAndDelete appendAndDelete = new AppendAndDelete("", "abcd");

        assertThat(appendAndDelete.delete(Position.FIRST)).isEqualTo("");

    }
}
