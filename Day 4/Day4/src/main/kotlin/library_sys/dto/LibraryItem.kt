package library_sys.dto

open class LibraryItem(
    val title: String,
    val isbn: String,
    val publication: String,
    val numberOfPages: Int
) {
    var isAvailable: Boolean = true
        private set

    fun lendItem() {
        if (isAvailable) isAvailable = false
    }

    fun returnItem() {
        isAvailable = true
    }

    override fun toString(): String {
        return "$title ($isbn) - $publication, Pages: $numberOfPages, Available: $isAvailable"
    }
}