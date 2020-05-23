package com.unixlover.basicWebSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("books")
    public List<Book> getAllBooks() {

        return Arrays.asList(new Book(1l, "Spring in 5 steps", "Rang Boss"));
    }
}
