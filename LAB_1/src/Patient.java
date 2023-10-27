import java.util.Random;
public class Patient implements GeneratePersonalInfo, GenerateNumInfo, GenerateLocation{
    private String name;
    private String surname;
    private String gender;
    private String ID;
    private String dateBirth;
    private String room;

    @Override
    public void setPersonalData(){
        Random rand = new Random();
        if (rand.nextInt(2)==0){
            gender = "Female";
        }
        else {
            gender = "Male";
        }
        String[] Female = new String[] {"Natalia","Maria","Elena","Vlada","Anastasia"};
        String[] Male = new String[] {"Mihail","Alexandr","Vasilii","Igor","Dumitru"};

        if (gender == "Female"){
            name = Female[rand.nextInt(5)];
        }
        else {
            name = Male[rand.nextInt(5)];
        }

        String[] surnames=new String[] {"Bulai","Konjevic","Vdovicenco","Baxanean","Magal"};
        surname = surnames[rand.nextInt(5)];
    }  

    @Override
    public void setNumData(){
        Random rand = new Random();
        String[] numbers=new String[] {"0","1","2","3","4","5","6","7","8","9","10","11","12"};
        ID=" ";
        for (int i=0;i<6;i++){
            ID+=numbers[rand.nextInt(10)];
        }
        String day = numbers[rand.nextInt(3)]+numbers[rand.nextInt(9)+1];
        String month = numbers[rand.nextInt(12)+1];
        String year = "19"+numbers[rand.nextInt(10)]+numbers[rand.nextInt(10)];

        dateBirth = day+"."+month+"."+year;
    }

    @Override
    public void setLocation(){
        Random rand = new Random();
        String[] numbers=new String[] {"0","1","2","3","4","5","6","7","8","9","10","11","12"};
        room = numbers[rand.nextInt(2)]+numbers[rand.nextInt(9)]+numbers[rand.nextInt(9)];
    }

    public String getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }  

    public String getID(){
        return ID;
    }

    public String getDateBirth(){
        return dateBirth;
    }

    public String getRoom(){
        return room;
    }
}
