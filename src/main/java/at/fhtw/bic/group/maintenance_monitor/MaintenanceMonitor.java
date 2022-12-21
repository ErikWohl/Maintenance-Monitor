package at.fhtw.bic.group.maintenance_monitor;

import org.springframework.stereotype.Component;

@Component
public class MaintenanceMonitor {
    public MaintenanceMonitor() {

    }
    public final String DEFAULT = "No Problems";
    private String message = DEFAULT;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void resetMessage() {
        message = DEFAULT;
    }
}
