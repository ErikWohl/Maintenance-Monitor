package at.fhtw.bic.group.maintenance_monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorControllerTests {

    @Test
    void resetMappingTest(){
        // A - Arrange (vorbereiten, d.h. eine Instanz der zu testenden Klasse anlegen)
        var monitor = new MaintenanceMonitor();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var res = monitor.getMessage();

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht)
        assertEquals(res, monitor.DEFAULT);
    }

    @Test
    void setMappingTest(){
        // A - Arrange
        var monitor = new MaintenanceMonitor();

        // A - Act
        monitor.setMessage("Service checks: No power until 5:00 pm");
        var res = monitor.getMessage();

        // A - Assert
        assertEquals(res, "Service checks: No power until 5:00 pm");
    }

    @Test
    void getMappingTestDefault(){
        // A - Arrange
        var monitor = new MaintenanceMonitor();

        // A - Act
        //After Server-Start the default message should be answered to the Client
        monitor.resetMessage();
        var res = monitor.getMessage();

        // A - Assert
        assertEquals(res, monitor.DEFAULT);
    }
}

