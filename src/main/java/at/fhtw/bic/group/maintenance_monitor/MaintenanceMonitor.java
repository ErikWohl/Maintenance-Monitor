package at.fhtw.bic.group.maintenance_monitor;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MaintenanceMonitor {
    public MaintenanceMonitor() {

    }
    public final String DEFAULT = "Everything works as expected";
    private String message = DEFAULT;

    private Date lastUpdated = new Date();

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

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
