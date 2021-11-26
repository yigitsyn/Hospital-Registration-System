
public class CovidPatient extends Patient {

    private String sympthoms;

    public CovidPatient(String name, String surname, boolean isInsurance, int age, String sympthoms) {
        super(name, surname, isInsurance, age);
        this.sympthoms = sympthoms;
    }

    @Override
    public double calculateFee() {
        double fee = 0;
        if (this.isInsurance) {
            if (this.sympthoms.equalsIgnoreCase("mild")) {
                fee += 10;
            } else if (this.sympthoms.equalsIgnoreCase("heavy")) {
                fee += 20;
            }
        } else {
            if (this.sympthoms.equalsIgnoreCase("mild")) {
                fee += 50;
            }
            if (this.sympthoms.equalsIgnoreCase("heavy")) {
                fee += 100;
            }
        }
        return fee;
    }

    public String getSympthoms() {
        return sympthoms;
    }

    public void setSympthoms(String sympthoms) {
        this.sympthoms = sympthoms;
    }

    @Override
    public String toString() {
        return super.toString() + "sympthoms=" + sympthoms + "\n";
    }

}
