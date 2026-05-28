package app.infrastructure.expose.web;

import app.application.business.CelsiusFahrenheit;
import app.application.business.FahrenheitCelsius;
import app.application.business.KilometerMilla;
import app.application.business.MillaKilometer;
import app.application.model.CelsiusCommand;
import app.application.model.FahrenheitCommand;
import app.application.model.KilometerCommand;
import app.application.model.MillaCommand;
import app.infrastructure.mapper.CelsiusMapper;
import app.infrastructure.mapper.FahrenheitMapper;
import app.infrastructure.mapper.KilometerMapper;
import app.infrastructure.mapper.MillaMapper;
import app.infrastructure.model.CelsiusQuery;
import app.infrastructure.model.FahrenheitQuery;
import app.infrastructure.model.KilometerQuery;
import app.infrastructure.model.MillaQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("")
@ApplicationScoped
public class ServiceApi {
    @Inject
    CelsiusFahrenheit celsiusFahrenheit;

    @Inject
    FahrenheitCelsius  fahrenheitCelsius;

    @Inject
    KilometerMilla  kilometerMilla;

    @Inject
    MillaKilometer   millaKilometer;

    @Inject
    KilometerMapper kilometerMapper;

    @Inject
    CelsiusMapper  celsiusMapper;

    @Inject
    MillaMapper millaMapper;

    @Inject
    FahrenheitMapper fahrenheitMapper;

    @GET
    @Path("kilometer")
    public float get(@BeanParam KilometerQuery kilometerQuery) {
        KilometerCommand command = kilometerMapper.toKilometerCommand(kilometerQuery);
        return kilometerMilla.execute(command);
    }

    @GET
    @Path("celsius")
    public float getC(@BeanParam CelsiusQuery celsiusQuery) {
        CelsiusCommand celsiusCommand = celsiusMapper.toCommand(celsiusQuery);
        return celsiusFahrenheit.execute(celsiusCommand);
    }

    @GET
    @Path("milla")
    public float getM(@BeanParam MillaQuery millaQuery) {
        MillaCommand millaCommand = millaMapper.toCommand(millaQuery);
        return millaKilometer.execute(millaCommand);
    }

    @GET
    @Path("fahrenheit")
    public float getF(@BeanParam FahrenheitQuery fahrenheitQuery) {
        FahrenheitCommand fahrenheitCommand = fahrenheitMapper.toCommand(fahrenheitQuery);
        return fahrenheitCelsius.execute(fahrenheitCommand);
    }
}
