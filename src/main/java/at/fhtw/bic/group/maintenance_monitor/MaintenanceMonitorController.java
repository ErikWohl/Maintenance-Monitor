package at.fhtw.bic.group.maintenance_monitor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaintenanceMonitorController {
    @GetMapping("/")
    String getMessage(Model model){
        model.addAttribute("testMessage", "Hello World 2.0");
        return "greenMonitor";
    }
}
