class SimpleMedicalProcedure implements MedicalProcedure {
    private String name;

    public SimpleMedicalProcedure(String name) {
        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println("Performing simple medical procedure: " + name);
    }
}
