package br.com.hidelbrandorios.demo.entity.user.DTO;

import br.com.hidelbrandorios.demo.entity.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}