package com.protekto.ingesta_metricas.dto;

import lombok.Data;

@Data
public class RendimientoDTO {
    private Double usoCPUPorcentaje;
    private Double temperaturaCPUCelsius;
    private Double usoRAMPorcentaje;
}