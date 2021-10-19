package com.banca.proyectoBancaSemana1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "client")
public class Client {
    private Integer id;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
}
