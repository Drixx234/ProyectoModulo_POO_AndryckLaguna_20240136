package Models.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@ToString
@Getter @Setter
@EqualsAndHashCode
@Data
public class DTOProvider {

    private int providerID;

    @NotBlank(message = "El nombre es obligatorio")
    private String providerName;

    @NotBlank(message = "el numero es obligatorio")
    private String providerPhone;

    @NotBlank(message = "La direccion es obligatoria")
    private Date providerAddress;

    @NotBlank(message = "el email es obligatorio")
    @Email(message = "el Email no es valido")
    private String providerEmail;

    @NotBlank(message = "El Codigo es obligatorio")
    private String providerCode;

    @NotBlank(message = "El Status es obligatorio")
    private String providerStatus;

    @NotBlank(message = "El comentario es obligatorio")
    private String providerComments;

}