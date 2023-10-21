// Solicitar tres números al usuario mediante prompts y guardarlos en variables
let numero1 
let numero2 
let numero3 

do {
  numero1 = parseFloat(prompt("Ingrese el primer número:")); 
  if (isNaN(numero1)) {
    alert("Por favor, ingrese un valor numérico válido.");
  }
} while (isNaN(numero1))

do {
  numero2 = parseFloat(prompt("Ingrese el segundo número:")); 
  if (isNaN(numero2)) {
    alert("Por favor, ingrese un valor numérico válido.");
  }
} while (isNaN(numero2))

do {
  numero3 = parseFloat(prompt("Ingrese el tercer número:")); 
  if (isNaN(numero3)) {
    alert("Por favor, ingrese un valor numérico válido.");
  }
} while (isNaN(numero3))

// Verificar si los números son iguales
if (numero1 === numero2 && numero2 === numero3) {
  console.log("Los números son iguales.");
} else {
  // Crear un array con los números
  let numeros = [numero1, numero2, numero3];

  // Ordenar los números de mayor a menor
  let ordenMayorAMenor = numeros.slice().sort((a, b) => b - a);

  // Ordenar los números de menor a mayor
  let ordenMenorAMayor = numeros.slice().sort((a, b) => a - b);

  // Mostrar los números ordenados por consola
  console.log("Números de mayor a menor:", ordenMayorAMenor);
  console.log("Números de menor a mayor:", ordenMenorAMayor);
}