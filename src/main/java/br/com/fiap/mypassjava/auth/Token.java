package br.com.fiap.mypassjava.auth;

public record Token(String token, String type, String username) {
}
