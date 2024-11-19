package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Hairdresser;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class HairdresserController {

    @InitBinder
    public void InitBinder(WebDataBinder binder){
        binder.addValidators(new HairdresserValidator());
    }

    @RequestMapping("/hairdressers")
    public String hairdresser(Model model) {
        model.addAttribute("hairdressers",Hw1Application.hairdressers);
        return "hairdressers/list";
    }


    @RequestMapping("/newHairdresser")
    public String newhairdresser(Model model){
        model.addAttribute("hairdresser", new Hairdresser());
        return "hairdressers/form";
    }

    @RequestMapping("/addHairdresser")
    public String addHairdresser(@Valid @ModelAttribute Hairdresser hairdresser, BindingResult result){

        if(result.hasErrors()){
            return"hairdressers/form";
        }
        Hw1Application.hairdressers.add(hairdresser);
        return "redirect:/hairdressers";
    }

}
