public class Student {

    private String first_name;
    private String last_name;
    private Faculty faculty;
    private int semester;
    private int age;

    public Student(String fn, String ln, Faculty fac, int sem, int a)
    {
        first_name = fn;
        last_name = ln;
        faculty = fac;
        age = a;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getSemester() {
        return semester;
    }

    public int getAge() {
        return age;
    }




}
