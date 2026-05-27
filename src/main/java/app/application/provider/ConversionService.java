package app.application.provider;

import app.application.model.CelsiusCommand;
import app.application.model.FahrenheitCommand;
import app.application.model.MillaCommand;
import app.application.model.KilometerCommand;

public interface ConversionService {
    float conversionCelsiusFahrenheit(CelsiusCommand command);
    float conversionFahrenheitCelsius(FahrenheitCommand command);
    float conversionKilometerMilla(KilometerCommand command);
    float conversionMillaKilometer(MillaCommand command);
}
