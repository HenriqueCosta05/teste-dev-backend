package com.henriquecostadev.costumersapi.models;

import com.henriquecostadev.costumersapi.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Document(collection = "Clientes")
public class Costumer {
    @Id
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "A data de nascimento é obrigatória")
    private Date birthDate;

    @NotBlank(message = "O sexo é obrigatório")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ElementCollection
    private Map<String, Integer> healthIssues;

}
