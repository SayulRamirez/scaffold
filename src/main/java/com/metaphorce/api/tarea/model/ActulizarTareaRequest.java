package com.metaphorce.api.tarea.model;

import jakarta.validation.constraints.NotNull;

public record ActulizarTareaRequest(

        @NotNull(message = "The field must not be null")
        Long id,

        boolean status
) {
}
