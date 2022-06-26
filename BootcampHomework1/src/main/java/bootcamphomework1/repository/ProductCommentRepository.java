package bootcamphomework1.repository;

import bootcamphomework1.dto.CommentResponse;
import bootcamphomework1.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductCommentRepository extends JpaRepository<ProductComment,Integer> {

    @Query("SELECT new bootcamphomework1.dto.CommentResponse(c.name , p.comment) FROM User c JOIN c.comments p where c.name=:n")
    public List<CommentResponse> getUserComments(@Param("n") String name);

    @Query("SELECT new bootcamphomework1.dto.CommentResponse(c.name , p.comment) FROM Product c JOIN c.comments p where c.name=:n")
    public List<CommentResponse> getProductComment(@Param("n") String name);

}
