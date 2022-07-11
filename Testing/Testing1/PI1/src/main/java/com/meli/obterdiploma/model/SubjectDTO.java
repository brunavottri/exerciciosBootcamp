package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;


@Getter @Setter
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíìïóòöúùçñ/s]+", message = "O nome do assunto deve começar com letra maiúscula")
    @Size(max = 30, message="O comprimento do nome não pode exceder 30 caracteres")
    String name;
    @NotNull
    @DecimalMin(value = "0.0", message = "A nota mínima da disciplina é de 0 pontos.")
    @DecimalMax(value = "10.0", message = "A nota máxima da disciplina é de 10 pontos.")
    Double score;
}
