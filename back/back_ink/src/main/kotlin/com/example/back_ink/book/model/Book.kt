package com.example.back_ink.book.model

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "books")
data class Book(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val author: String,

    val description : String ? = null,

    val publishedAt: LocalDateTime? = null
)
