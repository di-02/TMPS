import java.util.Random;
public class Nurse implements GeneratePersonalInfo{
    private String name;
    private String surname;

    @Override
    public void setPersonalData(){
        Random rand = new Random();
        String[] Female = new String[] {"Natalia","Maria","Elena","Vlada","Anastasia"};
        name = Female[rand.nextInt(5)];

        String[] surnames=new String[] {"Bulai","Konjevic","Vdovicenco","Baxanean","Magal"};
        surname = surnames[rand.nextInt(5)];
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    } 
}
