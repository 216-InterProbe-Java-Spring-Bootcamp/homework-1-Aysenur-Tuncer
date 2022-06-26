package bootcamphomework1.entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "NAME",length = 50)
    private String name;

    @Column(name = "PRICE", length = 20)
    private int price;

    @Column(name = "EXPIRATIONDATE",nullable = true)
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    @OneToMany(targetEntity = ProductComment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ppc_fk",referencedColumnName = "id")
    private List<ProductComment> comments;


}
