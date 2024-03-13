package fortune.dea.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("fortune")
    public class fortuneController {
        @GetMapping("/main")
        public String Main(){
            return "main";
        }

        @GetMapping ("/login")
        public String LoginForm(){
            return "index";
        }

        @PostMapping("/login")
        public String Login(){
            return "redirect:/fortune/main";
        }
}