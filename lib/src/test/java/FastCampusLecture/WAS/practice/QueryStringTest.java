package FastCampusLecture.WAS.practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueryStringTest {

    // List<QueryString>
    @Test
    void createTest() {

        QueryString queryString = new QueryString("operand1", "11");

        assertThat(queryString).isNotNull();
    }
}