class FlavoredMedicineDecorator implements Medicine {
    private Medicine medicine;

    public FlavoredMedicineDecorator(Medicine medicine) {
        this.medicine = medicine;
    }

    @Override
    public void consume() {
        medicine.consume();
        System.out.println("Adding flavor to the medicine");
    }
}