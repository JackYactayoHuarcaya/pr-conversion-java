package app.application.business;

import app.application.model.FahrenheitCommand;
import app.application.provider.ConversionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FahrenheitCelsius {
    @Inject
    ConversionService conversionService;
    public float execute(FahrenheitCommand command) {
       return conversionService.conversionFahrenheitCelsius(command.fahrenheit());
    }
}
