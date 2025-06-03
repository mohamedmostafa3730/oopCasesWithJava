package SchoolManagementSystem.superClasses;

public abstract class Person {
    private String name;
    private int id ;
    private String role ;

    public Person(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

}
