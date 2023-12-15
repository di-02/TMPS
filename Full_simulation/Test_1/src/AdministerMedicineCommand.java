class AdministerMedicineCommand implements MedicalCommand {
    private Nurse nurse;

    public AdministerMedicineCommand(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public void execute() {
        nurse.administerMedicine();
    }
}