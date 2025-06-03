package SchoolManagementSystem.superClasses;

public abstract class rooms {
    private int id;
    private Person Persons;
    private String role;

    public rooms(int id, Person Persons, String role) {
        this.id = id;
        this.Persons = Persons;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public Person getPersons() {
        return Persons;
    }

    public String getRole() {
        return role;
    }

    
}
