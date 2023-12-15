class DoctorPrescription {
    private PrescriptionStrategy prescriptionStrategy;

    public void setPrescriptionStrategy(PrescriptionStrategy prescriptionStrategy) {
        this.prescriptionStrategy = prescriptionStrategy;
    }

    public void prescribe() {
        prescriptionStrategy.prescribe();
    }
}