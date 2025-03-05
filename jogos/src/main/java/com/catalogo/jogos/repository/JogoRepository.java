// Arquivo: JogoRepository.java
package com.catalogo.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.catalogo.jogos.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}