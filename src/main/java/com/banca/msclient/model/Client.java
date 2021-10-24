package com.banca.msclient.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "client")
public class Client {
    @Id
    private String id;
    @Size(max = 8)
    @Field(name ="identityNumber")
    private String identityNumber;
    @Size(max = 200)
    @Field(name ="name")
    private String name;
    @Size(max = 200)
    @Field(name ="address")
    private String address;
    @Size(max = 9)
    @Field(name ="phone")
    private String phone;
    @Size(max = 80)
    @Field(name ="email")
    @Email
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registerDate;
    @Field(name ="clientType")
    private ClientType clientType;
}
