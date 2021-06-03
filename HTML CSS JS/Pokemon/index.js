async function fetchPokemons(list) {
    const PokemonData = document.getElementById("pokemon-data");

    const pokemon = list[0];

    for (let i = 0; i < list.length; i++) {
        const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${list[i]}`);
        const data = await response.json();
        const img = data.sprites.front_default;
        const imgElement = document.createElement('img');
        imgElement.src = img;
        PokemonData.appendChild(imgElement);
    }
    

}

const result = fetchPokemons(["charmander", "pikachu", "onix", "oddish"])