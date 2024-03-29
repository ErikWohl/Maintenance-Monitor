package at.fhtw.bic.group.maintenance_monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaintenanceWindowController {
    @Autowired
    public MaintenanceMonitor maintenanceMonitor;

    @GetMapping(value={"/api/message", "/"})
    String getMessage(Model model) {
        model.addAttribute("color", maintenanceMonitor.getMessage().equals(maintenanceMonitor.DEFAULT) ? "lightgreen" : "red");
        model.addAttribute("testMessage", maintenanceMonitor.getMessage());
        model.addAttribute("lastUpdated", maintenanceMonitor.getLastUpdated().toString());
        return "index";
    }
}
