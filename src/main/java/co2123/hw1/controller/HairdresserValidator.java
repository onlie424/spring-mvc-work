package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Hairdresser;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

public class HairdresserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Hairdresser.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Hairdresser h= (Hairdresser) target;

        for (Hairdresser x: Hw1Application.hairdressers){
            if (h.getId()==x.getId()){
                errors.rejectValue("id","","ID in Use");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "",
                "Your City needs a name!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "founder", "",
                "Your Founder needs a name!");

    }
}
