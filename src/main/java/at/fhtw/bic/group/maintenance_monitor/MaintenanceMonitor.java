package at.fhtw.bic.group.maintenance_monitor;

import org.springframework.stereotype.Component;

@Component
public class MaintenanceMonitor {
    public MaintenanceMonitor() {

    }
    private String message = "default";


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
