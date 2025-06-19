package com.example.back_ink.book.service

import com.example.back_ink.book.dao.BookRepository
import com.example.back_ink.book.model.Book
import org.springframework.stereotype.Service

@Service
class BookService (private val bookRepository: BookRepository) {

    fun getAllBooks(): List<Book> = bookRepository.findAll()

    fun searchbyTitle(query: String): Book? = bookRepository.findByTitle(query)

    fun save(book: Book) = bookRepository.save(book)
}