public class Gamer {

    private int id;
    private String FirstName;
    private String LastName;
    private String IdentyNumber;

    public Gamer(int id, String firstName, String lastName, String identyNumber) {
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.IdentyNumber = identyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getIdentyNumber() {
        return IdentyNumber;
    }

    public void setIdentyNumber(String identyNumber) {
        IdentyNumber = identyNumber;
    }
}
