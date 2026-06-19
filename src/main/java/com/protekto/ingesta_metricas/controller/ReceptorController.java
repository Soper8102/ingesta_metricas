package com.protekto.ingesta_metricas.controller;

import com.protekto.ingesta_metricas.dto.PayloadAgenteDTO; // Asegúrate de que coincida con tu nombre exacto
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReceptorController {

    @PostMapping("/receptor")
    public ResponseEntity<String> recibirMetricas(@RequestBody PayloadAgenteDTO payload) {

        // Imprimimos en la consola de IntelliJ para validar que los datos llegaron bien
        System.out.println("\n=========================================");
        System.out.println("✅ NUEVO REPORTE RECIBIDO DESDE EL AGENTE");
        System.out.println("Equipo: " + payload.getNombreHost());
        System.out.println("IP Principal: " + payload.getIpActual());
        System.out.println("Procesador: " + payload.getHardware().getProcesador());
        System.out.println("Uso de RAM: " + payload.getRendimiento().getUsoRAMPorcentaje() + "%");
        System.out.println("=========================================\n");

        return ResponseEntity.ok("Métricas recibidas correctamente por el Microservicio de Ingesta");
    }
}