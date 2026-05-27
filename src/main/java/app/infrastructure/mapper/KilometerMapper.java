package app.infrastructure.mapper;

import app.application.model.KilometerCommand;
import app.infrastructure.model.KilometerQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface KilometerMapper {
    @Mapping(source = "kilometerP", target = "kilometer")
    KilometerCommand toKilometerCommand(KilometerQuery kilometerQuery);
}
