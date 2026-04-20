package be.storm.intro_spring.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CylinderValidator implements ConstraintValidator<Cylinder, Integer> {

    int test;

    @Override
    public void initialize(Cylinder constraintAnnotation) {
        this.test = constraintAnnotation.test();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if(value == null){
            return true;
        }

        return value == 125 || value == 250 || value == 500 || value == 750 || value == 1000;
    }
}
