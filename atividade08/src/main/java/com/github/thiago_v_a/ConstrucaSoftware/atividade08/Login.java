package com.github.thiago_v_a.ConstrucaSoftware.atividade08;

import java.util.Scanner;

// Classe LoginInvalidoException
class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String message) {
        super(message);
    }
}

// Classe Login
public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazer_login(String usuarioDigitado, String senhaDigitada) throws LoginInvalidoException {
        if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha incorretos");
        }
    }
}

// Classe de teste (executável)
class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        Login login = new Login("usuario123", "senha456");

        try {
            boolean logado = login.fazer_login(usuario, senha);
            if (logado) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Usuário ou senha incorretos.");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}

