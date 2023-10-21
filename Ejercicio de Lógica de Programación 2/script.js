// Se declara una variable llamada tempCelsius
let tempCelsius;

//Este ciclo do while es para que verificar que si se ingrese un número válido
do {
    let input = prompt("Ingrese la temperatura en Celsius:");
    tempCelsius = parseFloat(input); //convierte a valor numérico

    if (isNaN(tempCelsius)) {
        alert("Por favor, ingrese un valor numérico válido.");
    }
} while (isNaN(tempCelsius));

// Convertir de Celsius a Fahrenheit
let tempFahrenheit = (tempCelsius * 9 / 5) + 32;

// Convertir de Celsius a Kelvin
let tempKelvin = tempCelsius + 273.15;

// Mostrar resultados
console.log("Grados Fahrenheit:", tempFahrenheit);
console.log("Grados Kelvin:", tempKelvin);