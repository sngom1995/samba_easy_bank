package sam.guru.bank.samba_bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    @Column(name="card_id")
    private int cardId;

    @Column(name="customer_id")
    private int customerId;

    @Column(name="card_type")
    private String cardType;

    @Column(name="card_number")
    private String cardNumber;

    @Column(name="total_limit")
    private int totalLimit;

    @Column(name="amount_used")
    private int amountUsed;

    @Column(name="available_amount")
    private int availableAmount;
    @Column(name="create_dt")
    private String createDt;

}
