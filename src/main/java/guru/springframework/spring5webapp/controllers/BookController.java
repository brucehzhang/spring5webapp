package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {

  private final BookRepository _bookRepository;

  public BookController(BookRepository bookRepository) {
    _bookRepository = bookRepository;
  }

  @RequestMapping("/books")
  public String getBooks(Model model) {
    model.addAttribute("books", _bookRepository.findAll());
    return "books/list";
  }


}
