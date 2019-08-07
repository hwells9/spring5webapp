package com.udemy.spring5.repositories;

import com.udemy.spring5.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

/**
 * Created by hwells on 2019-08-07
 * Package: com.udemy.spring5.repositories
 * Description:
 */

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
