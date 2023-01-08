package at.fhtw.bic.group.maintenance_monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    @Autowired
    public MaintenanceMonitor maintenanceMonitor;

    @RequestMapping("/api/message/set")
    String setMessage(Model model, @RequestParam(name="m") String m) {
        maintenanceMonitor.setMessage(m);
        return "ok";
    }

    @GetMapping("/api/message/reset")
    String resetMessage(Model model) {
        maintenanceMonitor.resetMessage();
        return "ok";
    }
}

