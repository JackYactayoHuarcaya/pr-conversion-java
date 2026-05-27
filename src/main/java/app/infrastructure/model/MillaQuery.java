package app.infrastructure.model;

import jakarta.ws.rs.QueryParam;

public record MillaQuery (@QueryParam("millaP") float millaP) {}
