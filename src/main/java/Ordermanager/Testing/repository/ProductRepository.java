package Ordermanager.Testing.repository;

import Ordermanager.Testing.entities.Category;
import Ordermanager.Testing.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
Product getFirstByTitle (String title);

}
