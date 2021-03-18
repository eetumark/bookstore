package fi.hh.swd20.bookstore2.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
User findByUsername(String username);
}

