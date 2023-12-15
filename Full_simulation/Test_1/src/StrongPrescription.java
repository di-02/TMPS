class StrongPrescription implements PrescriptionStrategy {
    @Override
    public void prescribe() {
        System.out.println("Prescribing a strong medicine");
    }
}