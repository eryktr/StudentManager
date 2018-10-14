public final class QueryGenerator {

    public static final String generateAddQuery(Student s) {
        String first_name = "\"" + s.getFirst_name() + "\"";
        String last_name = "\"" + s.getLast_name() + "\"";
        String faculty = "\"" + s.getFaculty().toString() + "\"";
        String tableName = ConnectionInfo.StudentTableName;
        int semester = s.getSemester();
        int age = s.getAge();
        String query = "INSERT INTO " + tableName + " VALUES(null, " + first_name + ", " + last_name +", " + faculty + ", " + semester + ", "+age +");";
        return  query;

    }

    public static final String generateRemoveQuery(int id)
    {
        String tableName = ConnectionInfo.StudentTableName;
        String query = "DELETE FROM " +tableName + " WHERE id = " + id + ";";
        return query;
    }

    public static final String generateSelectQuery()
    {
        String tableName = ConnectionInfo.StudentTableName;
        String query = "SELECT * FROM " + tableName +";";
        return query;
    }
}
