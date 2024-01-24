function calculate() {
  const operation = document.getElementById("operation").value;
  const num1 = document.getElementById("num1").value;
  const num2 = document.getElementById("num2").value;
  let result = "";

  const resultadoTuYo = procesarTuYo(num1, num2, operation);
  if (resultadoTuYo.error) {
    result = resultadoTuYo.error;
  } else {
    switch (operation) {
      case "sumar":
        result = sumar(resultadoTuYo.valor1, resultadoTuYo.valor2);
        break;
      case "restar":
        result = restar(resultadoTuYo.valor1, resultadoTuYo.valor2);
        break;
      case "multiplicar":
        result = multiplicar(resultadoTuYo.valor1, resultadoTuYo.valor2);
        break;
      case "dividir":
        result = dividir(resultadoTuYo.valor1, resultadoTuYo.valor2);
        break;
      case "batmovil":
        result = mostrarPoemaBatmovil();
        break;
      case "no quiero":
        const respuestaAlt = prompt("¿Entonces qué quieres hacer?");
        if (respuestaAlt.toLowerCase() === "dibujar") {
          const message = prompt(
            "Introduce el mensaje a mostrar dentro del corazón:"
          );
          const n = parseInt(prompt("Introduce el tamaño del corazón:"));
          result = dibujarCorazonMensaje(message, n);
        } else {
          result = "Operación no válida";
        }
        break;
      default:
        result = "Operación incorrecta";
    }
  }

  document.getElementById("result").innerText = result;
}

function procesarTuYo(num1, num2, operation) {
  alert("hola");
  const resultado = {};
  if (num1.toLowerCase() === "tu" && num2.toLowerCase() === "yo") {
    alert('hey');
    resultado.mensaje = obtenerMensajeEspecial(operation);
  } else if (!isNaN(parseFloat(num1)) && !isNaN(parseFloat(num2))) {
    resultado.valor1 = parseFloat(num1);
    resultado.valor2 = parseFloat(num2);
  } else {
    resultado.error = "Valores introducidos no válidos";
  }
  return resultado;
}

function obtenerMensajeEspecial(operation) {
  switch (operation) {
    case "sumar":
      return (
        "*************************************\n" +
        "*     Tú y yo, nace la perfección   *\n" +
        "*           Duo dinámico            *\n" +
        "*         Baby, tú piénsalo         *\n" +
        "*    Tú y yo, somos un descontrol   *\n" +
        "*           Mundo caótico           *\n" +
        "*       Difícil la ecuación         *\n" +
        "*************************************"
      );
    case "restar":
      return "Seríamos dos mitades incompletas buscando la forma de volver a unirnos y completarnos de nuevo";
    case "multiplicar":
      return "Nuestra conexión se eleva al infinito y más allá";
    case "dividir":
      return "Te buscaría incansablemente la parte que me hace completo, porque sin ti mi vida está incompleta";
    default:
      return "Mensaje especial para la operación no definida";
  }
}

function sumar(num1, num2) {
  const resultado = num1 + num2;
  return `Resultado de sumar ${num1} y ${num2}: ${resultado}`;
}

function restar(num1, num2) {
  const resultado = num1 - num2;
  return `Resultado de restar ${num1} y ${num2}: ${resultado}`;
}

function multiplicar(num1, num2) {
  const resultado = num1 * num2;
  return `Resultado de multiplicar ${num1} y ${num2}: ${resultado}`;
}

function dividir(num1, num2) {
  if (num2 === 0) {
    return "No es posible dividir entre 0";
  }
  const resultado = num1 / num2;
  return `Resultado de dividir ${num1} entre ${num2}: ${resultado}`;
}
