package app.infrastructure.mapper;

import app.application.model.FahrenheitCommand;
import app.infrastructure.model.FahrenheitQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface FahrenheitMapper {
    @Mapping(source = "fahrenheitP", target = "fahrenheit")
    FahrenheitCommand toCommand(FahrenheitQuery fahrenheitQuery);
}
