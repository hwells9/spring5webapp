package com.udemy.spring5.repositories;

import com.udemy.spring5.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hwells on 2019-08-07
 * Package: com.udemy.spring5.repositories
 * Description:
 */

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
