package privateschool;

public class Trainer {

    private String firstName;
    private String lastName;
    private String stream;

    public Trainer(String fn, String ln, String str) {
        this.firstName = fn;
        this.lastName = ln;
        this.stream = str;
    }

    @Override
    public String toString() {
        return "Trainer{ " + firstName + " " + lastName + ", subject= " + stream + '}';
    }    
}
