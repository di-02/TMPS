// Main Simulation
public class App {
    public static void main(String[] args) {
        // Structural Design Patterns
        // =========================
        System.out.println("Structural Design Patterns:");
        System.out.println("---------------------------");

        // 1. Adapter Pattern
        AutomaticMedicineDispenser automaticMedicineDispenser = new AutomaticMedicineDispenser();
        MedicineDispenser medicineDispenser = new AutomaticMedicineAdapter(automaticMedicineDispenser);
        medicineDispenser.dispense();

        // 2. Decorator Pattern
        Medicine basicMedicine = new BasicMedicine();
        Medicine flavoredMedicine = new FlavoredMedicineDecorator(basicMedicine);
        flavoredMedicine.consume();

        // 3. Composite Pattern
        MedicalProcedure simpleProcedure = new SimpleMedicalProcedure("Blood Test");
        MedicalProcedure complexProcedure = new ComplexMedicalProcedure();
        ((ComplexMedicalProcedure) complexProcedure).addProcedure(new SimpleMedicalProcedure("X-ray"));
        ((ComplexMedicalProcedure) complexProcedure).addProcedure(new SimpleMedicalProcedure("MRI"));

        complexProcedure.perform();

        // 4. Proxy Pattern
        RealDoctor realDoctor = new RealDoctor();
        Doctor proxyDoctor = new ProxyDoctor(realDoctor);
        proxyDoctor.prescribeMedicine();

        // Behavioral Design Patterns
        // =========================
        System.out.println("\nBehavioral Design Patterns:");
        System.out.println("---------------------------");

        // 1. Observer Pattern
        Pharmacy pharmacy = new Pharmacy();
        DoctorOffice doctorOffice = new DoctorOffice();
        doctorOffice.addObserver(pharmacy);

        doctorOffice.notifyObservers("Prescription for patient");

        // 2. Strategy Pattern
        PrescriptionStrategy strongPrescription = new StrongPrescription();
        PrescriptionStrategy mildPrescription = new MildPrescription();

        DoctorPrescription doctorPrescription = new DoctorPrescription();
        doctorPrescription.setPrescriptionStrategy(strongPrescription);
        doctorPrescription.prescribe();

        doctorPrescription.setPrescriptionStrategy(mildPrescription);
        doctorPrescription.prescribe();

        // 3. Command Pattern
        Nurse nurse = new Nurse();
        MedicalCommand administerMedicineCommand = new AdministerMedicineCommand(nurse);
        administerMedicineCommand.execute();

        // 4. State Pattern
        HealthState healthyState = new HealthyState();
        HealthState sickState = new SickState();

        PatientContext patientContext = new PatientContext();
        patientContext.setHealthState(healthyState);
        patientContext.handleHealthState();

        patientContext.setHealthState(sickState);
        patientContext.handleHealthState();
    }
}
