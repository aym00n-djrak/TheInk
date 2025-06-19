package com.example.back_ink.book.controller
import com.example.back_ink.book.service.BookService
import com.example.back_ink.book.model.Book
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class BookController (
    private val bookService: BookService
){
    @GetMapping
    fun getAll(): List<Book> = bookService.getAllBooks()

    @GetMapping("/search")
    fun search(@RequestParam query: String): Book? = bookService.searchbyTitle(query)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody book: Book): Book = bookService.save(book)
}