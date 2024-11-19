package co2123.hw1.controller;

import co2123.hw1.domain.Stylist;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class StylistValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {

        return Stylist.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Stylist s=(Stylist) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","","Name field requires inputs!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"qualification","","Qualification field needs inputs");

        List<String> required = new ArrayList<String>();
        required.add("Bob cut");
        required.add("Bowl cut");
        required.add("Buzz cut");

        if (!required.contains(s.getExpertise())) {
            errors.rejectValue("expertise", "", "Expertise isn't available");

        }
        if (s.getPrice()<1 || s.getPrice()>10){
            errors.rejectValue("price", "", "Price must be between 1 and 10");

        }





    }

}
