package app.infrastructure.mapper;

import app.application.model.CelsiusCommand;
import app.infrastructure.model.CelsiusQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface CelsiusMapper {
    @Mapping(source = "celsiusP", target = "celsius")
    CelsiusCommand toCommand(CelsiusQuery  celsiusQuery);
}
