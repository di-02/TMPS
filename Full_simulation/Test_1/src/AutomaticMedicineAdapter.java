class AutomaticMedicineAdapter implements MedicineDispenser {
    private AutomaticMedicineDispenser automaticMedicineDispenser;

    public AutomaticMedicineAdapter(AutomaticMedicineDispenser automaticMedicineDispenser) {
        this.automaticMedicineDispenser = automaticMedicineDispenser;
    }

    @Override
    public void dispense() {
        automaticMedicineDispenser.autoDispense();
    }
}