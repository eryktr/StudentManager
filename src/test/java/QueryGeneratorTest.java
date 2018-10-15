import org.junit.Assert;
import org.junit.Test;

public class QueryGeneratorTest {
    @Test
    public void TestGenerateAddQuery() {
        Student s = new Student("Foo", "Bar", Faculty.W11, 3, 20);
        String required = "INSERT INTO student VALUES(null, \"Foo\", \"Bar\", \"W11\", 3, 20);";
        String testResult = QueryGenerator.generateAddQuery(s);
        Assert.assertEquals(required, testResult);
    }

    @Test
    public void TestDeleteQuery() {
        int id = 20;
        String required = "DELETE FROM student WHERE id = " + id + ";";
        String result = QueryGenerator.generateRemoveQuery(id);
        Assert.assertEquals(required, result);
    }

    @Test
    public void TestDisplayQuery() {
        String required = "SELECT * FROM student;";
        String result = QueryGenerator.generateSelectQuery();
        Assert.assertEquals(required, result);
        Assert.assertTrue(required.equals(result));
    }
}
