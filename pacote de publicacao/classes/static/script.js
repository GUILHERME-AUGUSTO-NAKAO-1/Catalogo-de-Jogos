function validarFormulario() {
    var titulo = document.getElementById("titulo").value;
    var desenvolvedora = document.getElementById("desenvolvedora").value;
    var genero = document.getElementById("genero").value;
    var ano = document.getElementById("ano").value;

    if (titulo == "") {
        alert("Título deve ser preenchido");
        return false;
    }

    if (desenvolvedora == "") {
        alert("Desenvolvedora deve ser preenchida");
        return false;
    }

    if (genero == "") {
        alert("Gênero deve ser preenchido");
        return false;
    }

    if (ano == "") {
        alert("Ano deve ser preenchido");
        return false;
    }

    return true;
}