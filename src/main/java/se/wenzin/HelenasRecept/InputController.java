package se.wenzin.HelenasRecept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class InputController {

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required = false, defaultValue = "World") String name) {
        Recipe recipe = Recipe.builder()
                .name("Chokladbollar")
                .description("gör bollar")
                .numberOfUnits(20)
                .build();
        model.addAttribute("recipe", recipe);
        return "hello";
    }
}
