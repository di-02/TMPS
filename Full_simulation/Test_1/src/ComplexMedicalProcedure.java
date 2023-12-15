import java.util.ArrayList;
import java.util.List;

class ComplexMedicalProcedure implements MedicalProcedure {
    private List<MedicalProcedure> procedures = new ArrayList<>();

    public void addProcedure(MedicalProcedure procedure) {
        procedures.add(procedure);
    }

    @Override
    public void perform() {
        System.out.println("Performing complex medical procedure:");
        for (MedicalProcedure procedure : procedures) {
            procedure.perform();
        }
    }
}