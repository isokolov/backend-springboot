package ru.javabegin.tasklist.backendspringboot.controller;

import org.springframework.web.bind.annotation.*;
import ru.javabegin.tasklist.backendspringboot.entity.Category;
import ru.javabegin.tasklist.backendspringboot.repo.CategoryRepository;

import java.util.List;

// используем @RestController вместо обычного @Controller, чтобы все ответы сразу оборачивались в JSON
// иначе пришлось бы выполнять лишнюю работу, использовать @ResponseBody для ответа, указывать тип отправки JSON
@RestController
@RequestMapping("/category")
public class CategoryController {

    // доступ к данным из БД
    private CategoryRepository categoryRepository;

    // автоматическое внедрение экземпляра класса через конструктор
    // не используем @Autowired ля переменной класса, т.к. "Field injection is not recommended "
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // для тестирования адрес: http://localhost:8080/category/test
    @GetMapping("/test")
    public List<Category> test() {
        List<Category> categories = categoryRepository.findAll();

        return categories;
    }

    @PostMapping("/add")
    public void add(@RequestBody Category category) {
        categoryRepository.save(category);
    }

}
