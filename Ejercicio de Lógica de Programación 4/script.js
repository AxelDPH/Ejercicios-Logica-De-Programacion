
do {
    n = parseFloat(prompt("Ingresa la cantidad de números que quieres ver de la serie de Fibonacci"));
    if (isNaN(n)) {
        alert("Por favor, ingrese un valor numérico válido.");
    } else if (n < 1) {
        alert("El número tiene que ser positivo")
    }
} while (isNaN(n) || (n < 1))

function fibonacci(n) {
    let answer = [0,1]; 
    for(let i= answer.length; i< n; i++) {
        answer.push(answer[i-1] + answer[i-2])
    } 
    return answer
    }
    answer = fibonacci(n)
    console.log(answer);