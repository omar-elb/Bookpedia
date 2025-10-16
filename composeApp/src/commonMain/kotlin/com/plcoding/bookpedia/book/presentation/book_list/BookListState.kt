package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)


val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Test Book $it",
        authors = listOf("Author ${it % 10}"),
        description = "This is a test description for book number $it.",
        imageUrl = "https://picsum.photos/200/300?random=$it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 3.5 + (it % 15) / 10.0,
        ratingsCount = 100 + (it * 10),
        numPages = 200 + (it * 2),
        numEditions = 1 + (it % 5),
    )
}