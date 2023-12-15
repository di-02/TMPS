class HealthyState implements HealthState {
    @Override
    public void handleHealthState() {
        System.out.println("Patient is healthy");
    }
}