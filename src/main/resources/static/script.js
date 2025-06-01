document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); 

    let login = document.getElementById("login").value;
    let senha = document.getElementById("senha").value;

    fetch("http://localhost:8083/bd/user/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ login: login, senha: senha })
    })
    .then(response => response.text())
    .then(data => {
        if (data.includes("sucesso")) {
            alert("Login realizado com sucesso!");
            window.location.href = "login.html"; 
        } else {
            document.getElementById("error-message").textContent = "Credenciais inválidas!";
        }
    })
    .catch(error => console.error("Erro na requisição:", error));
});
