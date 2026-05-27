package app.application.business;

import app.application.model.KilometerCommand;
import app.application.provider.ConversionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class kilometerMilla {
    @Inject
    ConversionService conversionService;
    public float execute(KilometerCommand command){
        return conversionService.conversionKilometerMilla(command);
    }
}
