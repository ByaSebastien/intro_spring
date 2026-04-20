package be.storm.intro_spring.validators;

import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CylinderValidator.class)
public @interface Cylinder {

    String message() default "Invalid cylinder value. Allowed values are: 125cc, 250cc, 500cc, 750cc, 1000cc.";

    int test() default 42;

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};
}
