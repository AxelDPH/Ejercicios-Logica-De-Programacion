
do {
    n = parseFloat(prompt("Ingrese el número para sacar su factorial:"));
    if (isNaN(n)) {
        alert("Por favor, ingrese un valor numérico válido.");
    } else if (n < 1) {
        alert("El número tiene que ser positivo")
    }
} while (isNaN(n) || (n < 1))

function factorial(n) {
    let answer = 1;
    if (n == 0 || n == 1) {
        return answer;
    }
    else {
        for (var i = n; i >= 1; i--) {
            answer = answer * i;
        }
        return answer;
    }
}

answer = factorial(n)
console.log("Factorial de " + n + " : " + answer);