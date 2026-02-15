package library_sys.db

import library_sys.dto.Librarian
import library_sys.dto.LibraryItem
import library_sys.dto.User

class LibraryDatabase {
    private val items: MutableList<LibraryItem> = mutableListOf()
    private val borrowedBooks: MutableMap<LibraryItem, User> = mutableMapOf()

    var currentLibrarian: Librarian? = null

    fun addBook(item: LibraryItem) {
        items.add(item)
        println("Added: ${item.title}")
    }

    fun viewAvailableBooks() {
        println("Available Books:")
        items.filter { it.isAvailable }.forEach { println(it) }
    }

    fun searchForBook(title: String) {
        val found = items.filter { it.title.contains(title, ignoreCase = true) }
        if (found.isEmpty()) println("No book found with title \"$title\"")
        else found.forEach { println(it) }
    }

    fun lendBook(item: LibraryItem, user: User) {
        if (item.isAvailable) {
            item.lendItem()
            borrowedBooks[item] = user
            println("${item.title} lent to ${user.name}")
        } else {
            println("${item.title} is currently not available")
        }
    }

    fun returnBook(item: LibraryItem) {
        if (!item.isAvailable && borrowedBooks.containsKey(item)) {
            item.returnItem()
            borrowedBooks.remove(item)
            println("${item.title} returned successfully")
        } else {
            println("${item.title} is not borrowed")
        }
    }

    fun viewBorrowedBooks() {
        println("Borrowed Books:")
        borrowedBooks.forEach { (item, user) ->
            println("${item.title} borrowed by ${user.name}")
        }
    }
}