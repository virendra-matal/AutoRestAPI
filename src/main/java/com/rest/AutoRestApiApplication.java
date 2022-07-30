package com.rest;

import com.rest.model.Books;
import com.rest.model.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoRestApiApplication implements CommandLineRunner{

    @Autowired
    private BooksRepository booksRepository;
	public static void main(String[] args) {
		SpringApplication.run(AutoRestApiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//            Books books = new Books();
//            books.setName("Java");
//            books.setAuthor("xyz");
//            booksRepository.save(books);
//            Books books1 = new Books();
//            books1.setName("Spring Boot");
//            books1.setAuthor("abc");
//            booksRepository.save(books1);
    }

}
