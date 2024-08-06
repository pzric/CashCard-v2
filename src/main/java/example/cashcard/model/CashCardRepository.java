package example.cashcard.model;

import org.springframework.data.repository.CrudRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
    Iterable<CashCard> findByOwner(String owner);
}
