package Matthew.Harris.socketSpringWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myControllers {

    @GetMapping("/get-hello")
    @ResponseBody
    public String index(){

        return "index";
    }
}
