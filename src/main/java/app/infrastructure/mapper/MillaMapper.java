package app.infrastructure.mapper;

import app.application.model.MillaCommand;
import app.infrastructure.model.MillaQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface MillaMapper {
    @Mapping(source = "millaP", target = "milla")
    MillaCommand toCommand(MillaQuery millaQuery);
}
