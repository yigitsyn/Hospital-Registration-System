
public class EmergencyPatient extends Patient implements Transferable {

    private boolean needsBed;
    private boolean needsTransfer;
    private String transferDestination;

    public EmergencyPatient(String name, String surname, boolean isInsurance, int age, boolean needsBed) {
        super(name, surname, isInsurance, age);
        this.needsBed = needsBed;
        this.needsTransfer = false;
        this.transferDestination = "";
    }

    @Override
    public double calculateFee() {
        double fee = 0;
        if (this.isInsurance) {
            if (needsBed) {
                fee += 50;
            }
        } else {
            if (this.needsBed == false) {
                fee += 250;
            }
        }
        return fee;
    }

    public boolean isNeedsBed() {
        return needsBed;
    }

    public void setNeedsBed(boolean needsBed) {
        this.needsBed = needsBed;
    }

    @Override
    public String toString() {
        return super.toString() + "needsBed:" + needsBed + "\n";
    }

    @Override
    public void transferTo(String s) {
        this.needsTransfer = true;
        this.transferDestination = s;
    }

}
