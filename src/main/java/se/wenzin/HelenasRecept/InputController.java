package se.wenzin.HelenasRecept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class InputController {

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
