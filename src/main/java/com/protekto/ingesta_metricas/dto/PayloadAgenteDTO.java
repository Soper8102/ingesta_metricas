package com.protekto.ingesta_metricas.dto;

import lombok.Data;

@Data
public class PayloadAgenteDTO {
    private String macPrincipal;
    private String nombreHost;
    private String usuarioActual;
    private String ipActual;
    private boolean internetConectado;
    private HardwareDTO hardware;
    private RendimientoDTO rendimiento;
}