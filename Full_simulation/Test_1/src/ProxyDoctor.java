class ProxyDoctor implements Doctor {
    private RealDoctor realDoctor;

    public ProxyDoctor(RealDoctor realDoctor) {
        this.realDoctor = realDoctor;
    }

    @Override
    public void prescribeMedicine() {
        // Additional checks or actions before prescribing
        System.out.println("Proxy doctor checks patient's history");
        realDoctor.prescribeMedicine();
    }
}