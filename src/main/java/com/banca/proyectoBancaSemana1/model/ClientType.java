package com.banca.proyectoBancaSemana1.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientType {
    @Id
    Integer code;
    @Size(max = 20)
    String name;
}
