import java.util.Random;
public class Doctor implements GeneratePersonalInfo, MedicalHierarchy{
    private String name;
    private String surname;
    private String department;
    private String branch;

    @Override
    public void setPersonalData(){
        Random rand = new Random();
        String[] Male = new String[] {"Mihail","Alexandr","Vasilii","Igor","Dumitru"};

        name = Male[rand.nextInt(4)];

        String[] surnames=new String[] {"Bulai","Konjevic","Vdovicenco","Baxanean","Magal"};
        surname = surnames[rand.nextInt(4)];
    }

    @Override
    public void setHierarchy(){
        Random rand = new Random();

        if (rand.nextInt(3)==0){
            department = "Cardiology";
        }
        else if (rand.nextInt(3)==1){
            department = "Endocrinology";
        }
        else {
            department = "Traumatology";
        }

        if (rand.nextInt(2)==0){
            branch = "Therapy";
        }
        else {
            branch = "Surgery";
        }
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }  

    public String getDepartment(){
        return department;
    }

    public String getBranch(){
        return branch;
    }
    
}
