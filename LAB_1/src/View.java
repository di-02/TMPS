import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

//import com.google.gson.*;


public class View {
    private String patientInfo;
    private String doctorInfo;
    private String nurseInfo;
    private String location;
    private String state;
    private char[] jsonString;

    public <Gson> void ViewOutput() throws IOException{
        int whileCount = 0;
        float transferred = 0, recovered = 0, dead = 0, sick = 0;
        while(true){
            ModelHospital model = new ModelHospital();
            model.implementLogic();
            Controller controller = new Controller();
            controller.setConstructor();
            patientInfo = controller.getPatientInfo();
            doctorInfo = controller.getDoctorInfo();
            nurseInfo = controller.getNurseInfo();
            location = controller.getLocation();
            state = controller.getState();

            if (state == "Transferred to another hospital"){
                transferred++;
            }
            else if (state == "Dead while treated"){
                dead++;
            }
            else if(state == "Out of danger"){
                sick++;
            }
            else{
                recovered++;
            }
           // Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //com.google.gson.Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //com.google.gson.Gson gson = ((Object) new GsonBuilder()).setPrettyPrinting().create();
            Map object = new LinkedHashMap();
            object.put("Patient",patientInfo);
            object.put("Doctor",doctorInfo);
            object.put("Nurse",nurseInfo);
            object.put("Number of room",location);
            object.put("State after manipulations",state);
            //String jsonString=gson.toJson(object);
            //gson.toJson(object, new FileWriter("patient.json"));


            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now(); 
            whileCount++;

            if (whileCount>10000){
                whileCount = 0;
                System.out.println("The date and time of entrance: "+dtf.format(now)); 
                //System.out.println(jsonString);
                System.out.println("Current statistics:");
                System.out.print("Dead:% ");
                System.out.println(100*(dead/(dead+transferred+sick+recovered)));
                System.out.print("Recovered:% ");
                System.out.println(100*(recovered/(dead+transferred+sick+recovered)));
                System.out.print("Out of danger:% ");
                System.out.println(100*(sick/(dead+transferred+sick+recovered)));
                System.out.println(" ");
            }
        }
    }
    
}
