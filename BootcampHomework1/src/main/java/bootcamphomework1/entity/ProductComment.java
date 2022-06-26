package bootcamphomework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="productcomment")
public class ProductComment {
    @Id
    private int id;

    @Column(name = "COMMENT", length = 500)
    private String comment;

    @Column(name = "COMMENTDATE")
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    /*@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
    private Product productId;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
    private User userId;*/

}
