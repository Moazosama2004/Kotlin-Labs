package library_sys

import library_sys.dto.*
import library_sys.db.*


fun main() {
    val librarian = Librarian("Alice", "L001", "pass123")
    val user1 = User("Bob", "U001", "Student")
    val user2 = User("Carol", "U002", "Teacher")

    val library = LibraryDatabase()
    library.currentLibrarian = librarian

    val book1 = Book("Kotlin Programming", "12345", "TechPub", 300)
    val book2 = Book("Data Structures", "67890", "EduPub", 400)
    val journal1 = Journal("Science Journal", "11223", "SciPub", 50)
    val magazine1 = Magazine("Tech Monthly", "44556", "MagPub", 30)

    println()

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(journal1)
    library.addBook(magazine1)

    println()

    library.viewAvailableBooks()
    println()
    library.searchForBook("Kotlin")

    println()

    library.lendBook(book1, user1)
    println()
    library.viewAvailableBooks()
    println()
    library.viewBorrowedBooks()

    println()

    library.returnBook(book1)
    println()
    library.viewAvailableBooks()
}