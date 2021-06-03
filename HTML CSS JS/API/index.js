async function fetchBooks(list) {
    const theDom = document.getElementsByTagName("html");
    console.log(theDom);
    theDom[0].children[1].children[2].style.backgroundColor = "red";
    const bookData = document.getElementById("book-data");

    const isbn = list[0];

    for (let i = 0; i < list.length; i++) {
        const response = await fetch(`https://openlibrary.org/isbn/${isbn}.json`);
        const data = await response.json();
        console.log(data);

        const name = data.title;
        const nameElement = document.getElementById('name');
        nameElement.innerText = name;
        bookData.appendChild(nameElement);
        
        
        const img = `http://covers.openlibrary.org/b/isbn/${isbn}-L.jpg`
        const imgElement = document.createElement('img');
        imgElement.src = img;
        bookData.appendChild(imgElement);
    }
    

}

const result = fetchBooks(["9781857028898"]);