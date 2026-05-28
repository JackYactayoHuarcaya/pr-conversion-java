package app.application.business;

import app.application.model.MillaCommand;
import app.application.provider.ConversionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MillaKilometer {
    @Inject
    ConversionService conversionService;
   public float execute(MillaCommand command){
        return conversionService.conversionMillaKilometer(command);
    }
}
