package com.example.nybooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks() : List<Book>{
        return listOf(
            Book("Teste 1", "Menino"),
            Book("Teste 2", "Menino"),
            Book("Teste 3", "Menino"),
            Book("Teste 4", "Menino")
        )
    }
}