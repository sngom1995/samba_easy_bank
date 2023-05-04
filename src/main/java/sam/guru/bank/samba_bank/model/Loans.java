package sam.guru.bank.samba_bank.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loans {

    @Id
    @Column(name="loan_number")
    private int loanNumber;

    @Column(name="customer_id")
    private int customerId;

    @Column(name="start_dt")
    private Date startDt;

    @Column(name="loan_type")
    private String loanType;

    @Column(name="total_loan")
    private int totalLoan;

    @Column(name="amount_paid")
    private int amountPaid;

    @Column(name="outstanding_amount")
    private int amountDue;

    @Column(name="create_dt")
    private Date createDt;
}
