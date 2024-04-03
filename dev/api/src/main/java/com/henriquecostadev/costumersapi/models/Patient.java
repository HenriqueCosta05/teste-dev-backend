package com.henriquecostadev.costumersapi.models;

import com.henriquecostadev.costumersapi.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Document(collection = "Clientes")
public class Patient {

    @MongoId
    @Id
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String name;

    @NotBlank(message = "A data de nascimento é obrigatória")
    private Date birthDate;

    @NotBlank(message = "O sexo é obrigatório")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ElementCollection
    private Map<String, Integer> healthIssues;

}
