class Pharmacy implements PatientObserver {
    @Override
    public void update(String message) {
        System.out.println("Pharmacy received prescription: " + message);
        System.out.println("Dispensing prescribed medicine");
    }
}