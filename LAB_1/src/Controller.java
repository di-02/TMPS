public class Controller {
    private String patientInfo;
    private String doctorInfo;
    private String nurseInfo;
    private String location;
    private String state;

    ModelHospital hospital = new ModelHospital();

    public void setConstructor(){
        hospital.implementLogic();
        patientInfo = hospital.getPatientInfo();
        doctorInfo = hospital.getDoctorInfo();
        nurseInfo = hospital.getNurseInfo();
        location = hospital.getLocation();
        state = hospital.getState();
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
        return location;
    }

    public String getState(){
        return state;
    }
}
