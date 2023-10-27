import java.util.Random;

public class ModelHospital {
    private Patient patient = new Patient();
    private Doctor doctor = new Doctor();
    private Nurse nurse = new Nurse();
    private String state;
    private String patientInfo;
    private String doctorInfo;
    private String nurseInfo;
    private String loc;

    private String[] doctors = new String[30];
    private String[] nurses = new String[30];
    private String[] department = new String[30];
    private Integer[] busy = new Integer[30];
    private String[] patients = new String[300];

    public void implementLogic(){

        for (int i=0;i<30;i++){
            doctor.setPersonalData();
            doctors[i]= doctor.getName()+' '+doctor.getSurname();
            nurse.setPersonalData();
            nurses[i] = nurse.getName()+' '+nurse.getSurname();
            doctor.setHierarchy();
            department[i] = doctor.getDepartment();
            busy[i]=0;
        }

        for (int i=0;i<300;i++){
            patient.setPersonalData();
            patient.setNumData();
            patients[i] = patient.getID()+' '+patient.getName()+' '+patient.getSurname()+' '+patient.getDateBirth();     
        }

        for (int i=0;i<30;i++){
            for (int j=0;j<300;j++){
                if (department[j] == department[i]){
                    busy[i]++;
                    Random rand = new Random();
                    int st = rand.nextInt(10);
                    if (st/2==0){
                        state = "Dead while treated";
                    } 
                    else if (st/2==1){
                        state = "Full recovery";
                    }
                    else if (st/2>1){
                        state = "Out of danger";
                    }
                    break;
                }

                if (busy[i]>=10){
                    state = "Transferred to another hospital";
                }
                doctor.setHierarchy();
                patient.setLocation();
                patientInfo = patients[j];
                doctorInfo = doctors[j];
                nurseInfo = nurses[j];
                loc = patient.getRoom();
            }
        }
    }

    public String getPatientInfo(){
        return patientInfo;
    }

    public String getDoctorInfo(){
        return doctorInfo;
    }

    public String getNurseInfo(){
        return nurseInfo;
    }

    public String getLocation(){
        return loc;
    }

    public String getState(){
        return state;
    }

}
