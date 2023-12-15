import java.util.ArrayList;
import java.util.List;


class DoctorOffice {
    private List<PatientObserver> observers = new ArrayList<>();

    public void addObserver(PatientObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (PatientObserver observer : observers) {
            observer.update(message);
        }
    }
}