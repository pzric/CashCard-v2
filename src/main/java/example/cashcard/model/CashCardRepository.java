package example.cashcard.model;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
    @Query("SELECT * FROM cash_card cc WHERE cc.owner = :#{authentication.name}")
    Iterable<CashCard> findByOwner();

    default Iterable<CashCard> findAll() {
        throw new UnsupportedOperationException("unsupported, please use findByOwner instead");
    }
}
