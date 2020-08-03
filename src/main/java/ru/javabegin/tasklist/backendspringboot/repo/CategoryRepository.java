package ru.javabegin.tasklist.backendspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javabegin.tasklist.backendspringboot.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
