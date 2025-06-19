package com.example.back_ink.book.dao

import com.example.back_ink.book.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface BookRepository : JpaRepository<Book, UUID> {
    fun findByTitle(title: String): Book?
}