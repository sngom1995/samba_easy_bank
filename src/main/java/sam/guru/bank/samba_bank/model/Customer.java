package sam.guru.bank.samba_bank.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    @Column(name="customer_id")
    private int id;

    private String email;

    @Column(name="phone_number")
    private String phoneNumber;
    @JsonIgnore
    private String pwd;
    private String role;

    @Column(name="create_dt")
    private String createDt;


}
