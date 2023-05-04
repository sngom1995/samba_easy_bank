package sam.guru.bank.samba_bank.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Table(name = "notice_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    @Column(name="notice_id")
    private int noticeId;

    @Column(name="notice_summary")
    private String noticeSummary;

    @Column(name="notice_details")
    private String noticeDetails;

    @Column(name="notic_beg_dt")
    private Date noticeBeginDt;

    @Column(name="notic_end_dt")
    private Date noticeEndDt;

    @Column(name="create_dt")
    private Date createDt;

    @Column(name="update_dt")
    private Date updateDt;

}
