package com.protekto.ingesta_metricas.dto; // Asegúrate de que coincida con tu paquete real

import lombok.Data;

@Data
public class HardwareDTO {
    private String motherboard;
    private String procesador;
    private String gpu;
    private Double ramTotalGB;
    private String sistemaOperativo;
    private String versionSistema;
}