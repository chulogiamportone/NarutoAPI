const API_DRAGONBALL = 'http://localhost:8080/api/characters';
const API_NARUTO = 'http://localhost:8081/api/characters';

const fighter1Select = document.getElementById('fighter1');
const fighter2Select = document.getElementById('fighter2');
const fighter1Image = document.getElementById('fighter1Image');
const fighter2Image = document.getElementById('fighter2Image');
const fightButton = document.getElementById('fightButton');
const resultDiv = document.getElementById('result');

let characters = [];
let ninjas = [];

async function fetchData() {
    try {
        const responseDB = await fetch(API_DRAGONBALL);

        characters = await responseDB.json();

        
    } catch (error) {
        console.error('Error al cargar los personajes:', error);
    }
    
    try {
        const responseNaruto = await fetch(API_NARUTO);

        ninjas = await responseNaruto.json();

    } catch (error) {
        console.error('Error al cargar los personajes:', error);
    }
    loadFighters();
}

function loadFighters() {
    [...characters, ...ninjas].forEach(fighter => {
        const option1 = document.createElement('option');
        option1.value = JSON.stringify(fighter);
        option1.text = `${fighter.nombre} (${fighter.raza || fighter.aldea})`;
        fighter1Select.appendChild(option1);

        const option2 = document.createElement('option');
        option2.value = JSON.stringify(fighter);
        option2.text = `${fighter.nombre} (${fighter.raza || fighter.aldea})`;
        fighter2Select.appendChild(option2);
    });
    const selected = JSON.parse(fighter1Select.value);
    fighter1Image.src = selected.url_imagen || 'placeholder1.png';
    const selected2	 = JSON.parse(fighter2Select.value);
    fighter2Image.src = selected2.url_imagen || 'placeholder2.png';
}

// Actualizar la imagen al seleccionar un personaje
fighter1Select.addEventListener('change', () => {
    const selected = JSON.parse(fighter1Select.value);
    fighter1Image.src = selected.url_imagen || 'placeholder1.png';
});

fighter2Select.addEventListener('change', () => {
    const selected = JSON.parse(fighter2Select.value);
    fighter2Image.src = selected.url_imagen || 'placeholder2.png';
});

fightButton.addEventListener('click', () => {
    const fighter1 = JSON.parse(fighter1Select.value);
    const fighter2 = JSON.parse(fighter2Select.value);

    if (!fighter1 || !fighter2) {
        alert('Seleccioná ambos luchadores.');
        return;
    }

    // Simular "nivelDePoder"
    const power1 = fighter1.nivelDePoder || (Math.floor(Math.random() * 1000) + 500);
    const power2 = fighter2.nivelDePoder || (Math.floor(Math.random() * 1000) + 500);

    let winner;
    if (power1 > power2) {
        winner = fighter1.nombre;
    } else if (power2 > power1) {
        winner = fighter2.nombre;
    } else {
        winner = "¡Empate!";
    }

    resultDiv.textContent = `🏆 El ganador es: ${winner}! 🥊`;
    resultDiv.classList.remove('hidden');
});

fetchData();
