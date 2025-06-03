package SchoolManagementSystem.superClasses;

public abstract class course {
    private String name;
    private int id;
    private Person teacher;

    public course(String name, int id, Person teacher) {
        this.name = name;
        this.id = id;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Person getTeacher() {
        return teacher;
    }

}