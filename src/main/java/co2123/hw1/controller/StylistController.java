package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Hairdresser;
import co2123.hw1.domain.Stylist;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StylistController {

    @InitBinder
    public void InitBinder(WebDataBinder binder){
        binder.addValidators(new StylistValidator());
    }

    @RequestMapping("/stylists")
    public String stylist(@RequestParam int hairdresser, Model model){
        for(Hairdresser h:Hw1Application.hairdressers){
            if (h.getId()== hairdresser){
                model.addAttribute("stylists",h.getStylists());
                model.addAttribute("hairdresser",hairdresser);
            }
        }

        return "stylists/list";
    }
    @RequestMapping("/newStylist")
    public String newstylist(@RequestParam int hairdresser, Model model){
        for (Hairdresser h:Hw1Application.hairdressers){
            if(h.getId() ==hairdresser){
                model.addAttribute("stylist",new Stylist());
                model.addAttribute("hairdresser",hairdresser);
            }
        }
        return "stylists/form";
    }
    @RequestMapping("/addStylist")
    public String addStylist(@Valid @ModelAttribute Stylist stylist, BindingResult result,@RequestParam int hairdresser,Model model){
        if (result.hasErrors()){
            model.addAttribute("hairdresser",hairdresser);
            return "stylists/form";
        }
        for (Hairdresser h:Hw1Application.hairdressers){
            if (h.getId()==hairdresser){
                h.getStylists().add(stylist);
            }
        }
        return "redirect:/hairdressers";
    }

}
