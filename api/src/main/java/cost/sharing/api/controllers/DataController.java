package cost.sharing.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DataController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
    
}
