package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "tbProvider")
@Getter @Setter @ToString @EqualsAndHashCode
public class EntitiesProvider {
    @Id
    @Column(name = "providerID")
    private int providerID;

    @Column(name = "providerName")
    private String providerName;

    @Column(name = "providerPhone")
    private String providerPhone;

    @Column(name = "providerAddress")
    private Date providerAddress;

    @Column(name = "providerEmail")
    private String providerEmail;

    @Column(name = "providerCode")
    private String providerCode;

    @Column(name = "providerStatus")
    private String providerStatus;

    @Column(name = "providerComments")
    private String providerComments;

}
