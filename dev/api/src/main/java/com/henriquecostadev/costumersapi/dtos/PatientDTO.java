package com.henriquecostadev.costumersapi.dtos;

import com.henriquecostadev.costumersapi.enums.Gender;
import com.henriquecostadev.costumersapi.models.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientDTO {

    private String name;

    private Date birthDate;

    private Gender gender;

    private Map<String, Integer> healthIssues;

    public static PatientDTO patientDTO (Patient patient) {
        return new PatientDTO(
                patient.getName(),
                patient.getBirthDate(),
                patient.getGender(),
                patient.getHealthIssues()
        );
    }
}
