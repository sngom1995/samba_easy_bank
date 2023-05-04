package sam.guru.bank.samba_bank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_transactions")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountTransactions {
    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name="customer_id")
    private int customerId;

    @Column(name = "transaction_dt")
    private String transactionDt;

    @Column(name = "transaction_amt")
    private Double transactionAmt;

    @Column(name="transaction_summary")
    private String transactionSummary;

    @Column(name="closing_balance")
    private int closingBalance;

    @Column(name="create_dt")
    private String createDt;

}
