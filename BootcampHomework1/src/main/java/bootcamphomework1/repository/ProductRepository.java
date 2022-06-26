package bootcamphomework1.repository;


import bootcamphomework1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {


    @Query("SELECT u FROM Product u where u.expirationDate<:date")
    public List<Product> getExpiredProduct(@Param("date") Date date);


    @Query("SELECT u FROM Product u where u.expirationDate>:date or u.expirationDate is null ")
    public List<Product> getNotExpiredProduct(@Param("date") Date date);


}
