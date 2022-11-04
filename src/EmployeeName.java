import java.util.Objects;

public class EmployeeName {
    private final String firstName;
    private final String secondName;
    private final String middleName;

    public EmployeeName(String firstName, String secondName, String middleName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;

    }

 @Override
    public String toString() {
        return firstName + " " + secondName + " " + middleName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (obj == null || getClass() != obj.getClass())
            return false;
        EmployeeName employeeName = (EmployeeName) obj;
        return Objects.equals(firstName, employeeName.firstName) && Objects.equals(secondName, employeeName.secondName) && Objects.equals(middleName, employeeName.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, middleName);
    }


}
