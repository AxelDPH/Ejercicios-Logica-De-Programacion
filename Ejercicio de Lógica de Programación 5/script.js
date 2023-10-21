
let newNumber
let mysteryNumber = Math.floor(Math.random() * 100) + 1;
do {
    newNumber = parseFloat(prompt("Adivine el número del 1 al 100"))
    if (isNaN(newNumber)) {
        alert("Por favor, ingrese un valor numérico válido.");
    } else if (newNumber < 1) {
    alert("El número tiene que ser positivo")
} else if (newNumber != mysteryNumber){
    alert("Ooops, ese no es el número misterioso")

}
} while (isNaN(newNumber) || (newNumber < 1) || newNumber != mysteryNumber)

alert("¡Adivinaste!")