
public abstract class Patient {

    protected int id;
    protected String name;
    protected String surname;
    protected int age;
    protected boolean isInsurance;
    protected ContactPerson contactPerson;

    public Patient(String name, String surname, boolean isInsurance, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isInsurance = isInsurance;
    }

    public boolean checkPatientId(int searchedId) {
        return this.id == searchedId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(boolean isInsurance) {
        this.isInsurance = isInsurance;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "id:" + id + "\nname:" + name + "\nsurname:" + surname + "\nage:" + age + "\nisInsurance:" + isInsurance + "\ncontactPerson:" + contactPerson + "\nFee:" + calculateFee() + "\n";
    }

    public abstract double calculateFee();

}
