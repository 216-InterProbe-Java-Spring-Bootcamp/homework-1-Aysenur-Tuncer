package bootcamphomework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "SURNAME", length = 50)
    private String surname;


    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 15)
    private String phoneNumber;

    @OneToMany(targetEntity = ProductComment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="upc_fk",referencedColumnName = "id")
    private List<ProductComment> comments;



}
