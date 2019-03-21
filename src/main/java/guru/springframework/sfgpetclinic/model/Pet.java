package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Pet {
    private LocalDate birthDate;
    private Owner owner;
    private PetType petType;
}
