class MildPrescription implements PrescriptionStrategy {
    @Override
    public void prescribe() {
        System.out.println("Prescribing a mild medicine");
    }
}
