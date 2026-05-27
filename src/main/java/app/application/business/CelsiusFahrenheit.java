package app.application.business;

import app.application.model.CelsiusCommand;
import app.application.provider.ConversionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CelsiusFahrenheit {
    @Inject
    ConversionService conversionService;
    public float execute(CelsiusCommand command) {
        return conversionService.conversionCelsiusFahrenheit(command);
    }
}
