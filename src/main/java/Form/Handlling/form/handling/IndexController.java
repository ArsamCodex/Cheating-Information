package Form.Handlling.form.handling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    @Autowired
    inputRepository inputRepository;


    @GetMapping
    public String main(Model model){
        model.addAttribute("input" , new Input());
        return "index";
    }

    @PostMapping
    public String save(Input input , Model model){
        inputRepository.save(input);


        model.addAttribute("input",input);
        return "saved";
    }


}