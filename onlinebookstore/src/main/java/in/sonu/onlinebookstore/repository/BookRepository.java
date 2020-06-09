package in.sonu.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sonu.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
