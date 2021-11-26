
import java.util.ArrayList;

public class PatientSys {

    public static ArrayList<Patient> patients = new ArrayList<Patient>();
    public static int numberOfPatients;

    public static boolean isIdExist(int id) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean addPatient(Patient patient) {
        boolean result;
        result = patients.add(patient);
        if (result) {
            numberOfPatients++;
        }
        return result;
    }

    public static Patient searchPatient(int id) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                return patients.get(i);
            }
        }
        return null;
    }

    public static Patient deletePatient(int id) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                return patients.remove(i);
            }
        }
        return null;
    }

    public static String displayPatient() {
        String dummy = "";
        for (int i = 0; i < patients.size(); i++) {
            dummy += patients.get(i);
        }
        return dummy;
    }

    public static double calculateTotalFee() {
        double totalFee = 0;
        for (int i = 0; i < patients.size(); i++) {
            totalFee += patients.get(i).calculateFee();
        }
        return totalFee;
    }

}
