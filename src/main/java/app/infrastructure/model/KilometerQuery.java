package app.infrastructure.model;

import jakarta.ws.rs.QueryParam;

public record KilometerQuery (@QueryParam("kilometerP") float kilometerP) {}
