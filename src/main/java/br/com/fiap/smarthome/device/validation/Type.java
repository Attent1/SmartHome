package br.com.fiap.smarthome.device.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = TypeValidator.class)

public @interface Type {
    String message() default "{device.invalid.type}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
