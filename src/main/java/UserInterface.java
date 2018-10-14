import java.util.Scanner;

public final class UserInterface {

    private final DBManager dbManager;
    private final Scanner scanner;
    private enum Action {Add, Delete, Display, Quit, Nothing}


    public UserInterface(DBManager manager) {
        dbManager = manager;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while(true) {
            Action action;
            System.out.println("[1] Add Student");
            System.out.println("[2] Delete Student");
            System.out.println("[3] Display Students");
            System.out.println("[4] Quit");
            System.out.println("Choice: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    action = Action.Add;
                    break;
                case 2:
                    action = Action.Delete;
                    break;

                case 3:
                    action = Action.Display;
                    break;

                case 4:
                    action = Action.Quit;
                    break;

                default:
                    action = Action.Nothing;
                    break;

            }
            executeAction(action);
        }
    }

    public void executeAction(Action action) {
        switch(action) {
            case Nothing:
                DoNothing();
                break;

            case Add:
                AddStudent();
                break;

            case Delete:
                DeleteStudent();
                break;

            case Display:
                DisplayStudents();
                break;
        }
    }

    public void AddStudent() {
        String firstName, lastName;
        Faculty faculty;
        int semester, age, facultyNum;

        System.out.print("First name: ");
        scanner.nextLine();
        firstName = scanner.nextLine();
        System.out.print("Last name: ");
        lastName = scanner.nextLine();
        System.out.print("Faculty (1-14): ");
        facultyNum = scanner.nextInt();
        faculty = Faculty.values()[facultyNum-1];
        System.out.print("Semester: ") ;
        semester = scanner.nextInt();
        System.out.print("Age: ");
        age = scanner.nextInt();

        dbManager.addStudent(new Student(firstName, lastName, faculty, semester, age));
    }

    public void DeleteStudent() {

    }

    public void DisplayStudents() {

    }

    public void DoNothing() {

    }


}
