const input = document.getElementById('isbn');
input.addEventListener("keyup", function(event) {
    if (event.keyCode === 13) {
    event.preventDefault();
    fetchBooks();
    }
})



async function fetchBooks() {

    const bookCover = document.getElementById('cover');

    const isbn = input.value;

    const response = await fetch(`https://openlibrary.org/isbn/${isbn}.json`);
    const data = await response.json();

    const authorurl = data.authors[0].key;
    const nameResponse = await fetch(`https://openlibrary.org${authorurl}.json`);
    const authorData = await nameResponse.json();

    const isbn10 = data.isbn_10;
    const isbn10Element = document.getElementById('isbn-10');
    isbn10Element.innerText = isbn10;

    const isbn13 = data.isbn_13;
    const isbn13Element = document.getElementById('isbn-13');
    isbn13Element.innerText = isbn13;

    const name = data.title;
    const nameElement = document.getElementById('book-title');
    nameElement.innerText = name;

    const author = authorData.name;
    const authorElement = document.getElementById('author');
    authorElement.innerText = author;

    const numPages = data.number_of_pages;
    const pagesElement = document.getElementById('num-pages');
    pagesElement.innerText = numPages;
    
    const img = `http://covers.openlibrary.org/b/isbn/${isbn}-L.jpg`;
    const imgElement = document.createElement('img');
    imgElement.src = img;
    bookCover.innerHTML = "";
    bookCover.appendChild(imgElement);
    }
    

const result = fetchBooks();