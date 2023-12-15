class PatientContext {
    private HealthState healthState;

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public void handleHealthState() {
        healthState.handleHealthState();
    }
}