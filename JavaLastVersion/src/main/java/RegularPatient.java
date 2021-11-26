public class RegularPatient extends Patient {
    
    private String department;
    private boolean pastCovidPatient;
    private boolean organDonor;

    public RegularPatient(String name, String surname, boolean isInsurance, int age,String department, boolean pastCovidPatient, boolean organDonor) {
        super(name, surname, isInsurance, age);
        this.department = department;
        this.pastCovidPatient = pastCovidPatient;
        this.organDonor = organDonor;
    }

    @Override
    public double calculateFee(){
        double fee=0;
        if(!this.isInsurance){
            if(this.department.equalsIgnoreCase("Neurology"))
                 fee+=300;
            else if(this.department.equalsIgnoreCase("Cardiology"))
                 fee+=400;
            else if(this.department.equalsIgnoreCase("Physical Medicine and Rehabilitation"))
                 fee+=200; 
           }
        else{
            if(this.department.equalsIgnoreCase("Neurology"))
                 fee+=50;
            else if(this.department.equalsIgnoreCase("Cardiology"))
                 fee+=80;
            else if(this.department.equalsIgnoreCase("Physical Medicine and Rehabilitation"))
                 fee+=40; 
        }
        return fee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPastCovidPatient() {
        return pastCovidPatient;
    }

    public void setPastCovidPatient(boolean pastCovidPatient) {
        this.pastCovidPatient = pastCovidPatient;
    }

    public boolean isOrganDonor() {
        return organDonor;
    }

    public void setOrganDonor(boolean organDonor) {
        this.organDonor = organDonor;
    }

    @Override
    public String toString() {
        return super.toString() + "department:" + department + "\npastCovidPatient:" + pastCovidPatient + "\norganDonor:" + organDonor + "\n";
    }
    
    
    
    
    
    
    
    
}
