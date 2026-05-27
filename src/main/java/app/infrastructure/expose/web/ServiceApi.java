package app.infrastructure.expose.web;

import app.application.model.KilometerCommand;
import app.infrastructure.integration.ConversionServiceImpl;
import app.infrastructure.mapper.KilometerMapper;
import app.infrastructure.model.KilometerQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("")
@ApplicationScoped
public class ServiceApi {
    @Inject
    ConversionServiceImpl conversionService;
    @Inject
    KilometerMapper kilometerMapper;

    @GET
    @Path("kilometer")
    public float get(@BeanParam KilometerQuery kilometerQuery) {
        KilometerCommand command = kilometerMapper.toKilometerCommand(kilometerQuery);
        return  conversionService.conversionKilometerMilla(command);
    }
}
