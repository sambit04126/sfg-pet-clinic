package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity {
    private LocalDate birthDate;
    private Owner owner;
    private PetType petType;
}
