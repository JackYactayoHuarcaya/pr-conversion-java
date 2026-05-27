package app.infrastructure.integration;

import app.application.model.CelsiusCommand;
import app.application.model.FahrenheitCommand;
import app.application.model.MillaCommand;
import app.application.model.KilometerCommand;
import app.application.provider.ConversionService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConversionServiceImpl implements ConversionService {
    @Override
    public float conversionCelsiusFahrenheit(CelsiusCommand command) {
         return (command.celsius() * (float) 1.8) + 32;
    }

    @Override
    public float conversionKilometerMilla(KilometerCommand command) {
        return command.kilometer() * (float) 0.621371;
    }

    @Override
    public float conversionFahrenheitCelsius(FahrenheitCommand command) {
        return (command.fahrenheit() - 32) / (float) 1.8;
    }

    @Override
    public float conversionMillaKilometer(MillaCommand command) {
        return command.milla() * (float) 1.609344;
    }
}
