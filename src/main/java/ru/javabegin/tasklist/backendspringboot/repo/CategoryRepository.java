package ru.javabegin.tasklist.backendspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javabegin.tasklist.backendspringboot.entity.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    // получить все значения, сортировка по названию
    List<Category> findAllByOrderByTitleAsc();

}
